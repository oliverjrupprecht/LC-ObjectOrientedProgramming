import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Map map = new Map();
        Room[] rooms = initializeRooms();
        Inventory inventory = new Inventory();
        Score score = new Score(100);

        for (Room room : rooms) {
            map.placeRoom(room.getPosition(), room.getSymbol());
        }

        Position playerPosition = rooms[0].getPosition();
        Room currentRoom = rooms[0];

        Scanner scanner = new Scanner(System.in);
        boolean gameRunning = true;

        System.out.println("You are a young prodigy programmer with a knack for hacking into government agencies, " +
                           "driven by your obsession with finding evidence of extra-terrestrial life.\n" +
                           "One fateful night, you discover a back door within the systems of GCHQ.\n" +
                           "While scrolling through files about the British government's dealings with the Martian Planetary Congress," +
                           " you inadvertently access the military's decommissioned nuclear defence network.\n" +
                           "In a moment of reckless curiosity, you fiddle with the ICBM systems, and due to your unfamiliarity with Linux,\n" +
                           "you mistakenly target Coventry, setting a missile to destroy it in just 24 hours.\n" +
                           "Panic sets in as you realize the catastrophic implications of your actions.\n" +
                           "To avert disaster and save the innocent people of Coventry," +
                           " you must embark on a perilous journey to a top-secret missile base in the Lake District,\n" +
                           "where you will need to solve puzzles and search for clues in order to find all the keys required to shut the system down.\n");

        while (gameRunning) {
            System.out.print(">> ");
            String command = scanner.nextLine().trim().toLowerCase();
            String[] commandParts = command.split(" ");

            switch (commandParts[0]) {
                case "move":
                    if (commandParts.length > 1) {
                        String direction = commandParts[1];

                        if (currentRoom.getName().equals("Base Entrance") && direction.equals("east")) {
                            System.out.println("The door is locked. You need a code to open it.");
                            System.out.print("Enter code: ");
                            String enteredCode = scanner.nextLine().trim();

                            if (enteredCode.equals("0104")) {
                                playerPosition = movePlayer(direction, playerPosition, map, rooms);
                                currentRoom = getRoomAtPosition(playerPosition, rooms);
                                System.out.println("The code was correct! You moved to " + currentRoom.getName());
                                score.visitRoom();
                            } else {
                                System.out.println("Incorrect code. The door remains locked.");
                            }
                        } else {
                            playerPosition = movePlayer(direction, playerPosition, map, rooms);
                            if (getRoomAtPosition(playerPosition, rooms) != null) {
                                currentRoom = getRoomAtPosition(playerPosition, rooms);
                                System.out.println("You moved to " + currentRoom.getName());
                                score.visitRoom();
                            }
                        }
                    } else {
                        System.out.println("Please specify a direction (north, south, east, west).");
                    }
                    break;



                case "search":
                    if (commandParts.length == 2) {
                        String feature = commandParts[1];
                        searchFeature(currentRoom, feature, inventory);
                    } else {
                        System.out.println("Please specify something to search, like 'search drawer'.");
                    }
                    break;

                case "inventory":
                    System.out.println("Inventory: " + inventory.displayInventory());
                    break;

                case "look":
                    if (commandParts.length == 1) {
                        System.out.println(currentRoom.getDescription());
                    } else {
                        System.out.println("You look at " + commandParts[1] + ". But nothing special happens.");
                    }
                    break;

                case "score":
                    System.out.println("Current Score: " + score.getScore());
                    break;

                case "map":
                    map.display();
                    break;

                case "help":
                    displayHelp();
                    break;

                case "quit":
                    System.out.println("Mission aborted.");
                    gameRunning = false;
                    break;

                default:
                    System.out.println("Unknown command!");
                    break;
            }
        }

        scanner.close();
    }

    private static Position movePlayer(String direction, Position position, Map map, Room[] rooms) {
        Position newPosition = new Position(position.x, position.y);

        switch (direction) {
            case "north": newPosition.x -= 1; break;
            case "south": newPosition.x += 1; break;
            case "east": newPosition.y += 1; break;
            case "west": newPosition.y -= 1; break;
            default: System.out.println("Invalid direction."); return position;
        }

        if (getRoomAtPosition(newPosition, rooms) != null) {
            return newPosition;
        } else {
            System.out.println("You cannot move in that direction, there's no room there.");
            return position;
        }
    }


    private static Room getRoomAtPosition(Position position, Room[] rooms) {
        for (Room room : rooms) {
            if (room.getPosition().x == position.x && room.getPosition().y == position.y) {
                return room;
            }
        }
        return null;
    }

    private static Room[] initializeRooms() {
        Room[] rooms = new Room[10];
        rooms[0] = new Room("Base Entrance", "A locked reinforced steel door blocks the entrance. Nearby, there's a security console. To the east there is the Surveillance room.", 'E', new Position(0, 0));
        rooms[1] = new Room("Surveillance Room", "The room is filled with monitors and blinking lights. You notice a drawer slightly open. To the south is the Armoury.", 'S', new Position(0, 1));
        rooms[2] = new Room("Armory", "Shelves lined with gear and weaponry, most locked behind cases. A dusty cabinet sits in the corner. To the east is the Toilets.", 'A', new Position(1, 1));
        rooms[3] = new Room("Toilets", "The disused toilets have an unpleasant smell. Eager to get out you spot a sparkle behind one of the taps. To the east is the Storage room.", 'T', new Position(1, 2));
        rooms[4] = new Room("Storage Room", "A room filled with old supplies and boxes stacked to the ceiling. You notice a shelf is about to fall down, maybe you should check it. To the south is the Lab.", 'S', new Position(1, 3));
        rooms[5] = new Room("Laboratory", "A lab with strange scientific equipment, papers scattered on the tables. To the south is the security room.", 'L', new Position(2, 3));
        rooms[6] = new Room("Security Room", "Security cameras cover every corner of the room, and a keypad sits on the wall. To the south is the Generator room.", 'S', new Position(3, 3));
        rooms[7] = new Room("Generator Room", "The hum of machines fills the air. The generator is running, powering the base. to the south is the storage vault.", 'G', new Position(4, 3));
        rooms[8] = new Room("Storage Vault", "A large vault door stands before you, requiring a code to open. To the east is the Control room", 'V', new Position(5, 3));
        rooms[9] = new Room("Control room", "The final room in the base, it has nine key slots and a clock that is ticking down to zero! Quickly", 'M', new Position(5, 4));

        return rooms;
    }

    private static void searchFeature(Room room, String feature, Inventory inventory) {
        switch (room.getName()) {
            case "Base Entrance":
                if (feature.equals("console")) {
                    System.out.println("Under the security console you find a small sticky note with the code '0104' written on it.");
                } else {
                    System.out.println("There’s nothing interesting here.");
                }
                break;

            case "Surveillance Room":
                if (feature.equals("drawer")) {
                    System.out.println("You search the drawer and find the Surveillance room key!");
                    inventory.addItem("Surveillance key");
                } else {
                    System.out.println("You find nothing of interest.");
                }
                break;

            case "Armory":
                if (feature.equals("cabinet")) {
                    System.out.println("You search the cabinet and find the Armoury key!");
                    inventory.addItem("Armoury key");
                } else {
                    System.out.println("There’s nothing in this spot.");
                }
                break;

            case "Toliets":
                if (feature.equals("tap")) {
                    System.out.println("You search behind the tap and find the Toilet key.");
                    inventory.addItem("Toilet Key");
                } else {
                    System.out.println("There is nothing in this spot.");
                }

            case "Storage Room":
                if (feature.equals("shelf")) {
                    System.out.println("You search the shelf and find a small box hidden behind some old crates. Inside, you find a key to the Generator Room.");
                    inventory.addItem("Generator key");
                } else {
                    System.out.println("You find nothing of interest.");
                }
                break;

            case "Laboratory":
                if (feature.equals("table")) {
                    System.out.println("You search the laboratory table and find a key labeled 'Security Room Key'.");
                    inventory.addItem("Lab key");
                } else {
                    System.out.println("You find nothing of interest.");
                }
                break;

            case "Security Room":
                if (feature.equals("keypad")) {
                    System.out.println("You notice a small compartment in the keypad. You open it and find a key to the Generator Room.");
                    inventory.addItem("Security key");
                } else {
                    System.out.println("Nothing interesting here.");
                }
                break;

            case "Generator Room":
                if (feature.equals("control panel")) {
                    System.out.println("In the control panel you find the generator key! You take it.");
                    inventory.addItem("Generator key");
                } else {
                    System.out.println("You find nothing of interest.");
                }
                break;

            case "Storage Vault":
                if (feature.equals("vault door")) {
                    System.out.println("The vault door is locked, but off to the side you see a small box and within it the Storage room key.");
                    inventory.addItem("Storage key");
                } else {
                    System.out.println("You find nothing of interest.");
                }
                break;

            case "Control room":
                System.out.println("There is nothing of interest here, hurry and enter the keys!");
                break;

            default:
                System.out.println("There is nothing to search here.");
                break;
        }
    }

    private static void checkGameOver(Inventory inventory) {
        String[] inventoryItems = inventory.getInventory();

        boolean isInventoryFull = true;
        for (String item : inventoryItems) {
            if (item == null || item.isEmpty()) {
                isInventoryFull = false;
                break;
            }
        }

        if (isInventoryFull) {
            System.out.println("Congratulations! You've gathered all the keys, and now you are entering them into the slots. " +
                               "\nA loud beep is sounded and you read from the screen \"MISSILE DISABLED\"." +
                               "\nGame over! You win");

            System.exit(0);
        } else {
            System.out.println("You have not gathered all the keys yet.");
        }
    }


    private static void displayHelp() {
        System.out.println("Available Commands:");
        System.out.println("move <direction> - Move to a new room (north, south, east, west).");
        System.out.println("look - Display the description of the current room.");
        System.out.println("look <feature/item> - Look closer at a specific feature or item.");
        System.out.println("inventory - Display the items you have obtained.");
        System.out.println("score - Display your current score.");
        System.out.println("map - Display the current map of the game world.");
        System.out.println("quit - Exit the game.");
    }
}

