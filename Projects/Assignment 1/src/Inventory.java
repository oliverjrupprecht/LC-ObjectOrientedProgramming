public class Inventory {
    private String[] inventory;
    private int itemCount;
    private final int MAX_ITEMS = 10;

    public Inventory() {
        this.inventory = new String[MAX_ITEMS];
        this.itemCount = 0;
    }

    public void addItem(String item) {
        for (int i = 0; i < MAX_ITEMS; i++) {
            if (inventory[i] == null) {
                inventory[i] = item;
                System.out.println(item + " is in slot " + (i + 1) + " of your inventory.");
                itemCount++;
                return;
            }
        }
        System.out.println("There are no free slots in your inventory!");
    }

    public int hasItem(String item) {
        for (int i = 0; i < MAX_ITEMS; i++) {
            if (inventory[i] != null && inventory[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }

    public void removeItem(String item) {
        boolean found = false;
        for (int i = 0; i < MAX_ITEMS; i++) {
            if (inventory[i] != null && inventory[i].equals(item)) {
                inventory[i] = null;
                found = true;
                System.out.println(item + " has been removed from your inventory!");
                itemCount--;
                break;
            }
        }

        if (!found) {
            System.out.println("Item not in inventory, so cannot be removed!");
        }
    }

    public String displayInventory() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < MAX_ITEMS; i++) {
            if (inventory[i] != null) {
                result.append(inventory[i]).append(" ");
            } else {
                result.append("empty ");
            }
        }
        return result.toString().trim();
    }

    public String[] getInventory() {
        return inventory;
    }
}

