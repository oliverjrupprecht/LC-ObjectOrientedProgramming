import java.util.Objects;

public class Inventory {
    private String[] inventory;
    private int itemCount;
    private final int MAX_ITEMS = 10;

    public Inventory() {
        this.inventory = new String[MAX_ITEMS];
        this.itemCount = itemCount;
    }

    public void addItem(String item) {
        for (int i = 0; i < MAX_ITEMS; i++) {
            if (inventory[i] == null) {
                inventory[i] = item;
                System.out.println(item + " is in slot " + (i + 1) + " of your inventory.");
                itemCount++;
            }

            System.out.println("There are no free slots in your inventory!");
        }
    }

    public int hasItem(String item) {
        for (int i = 0; i < MAX_ITEMS; i++) {
            if (Objects.equals(inventory[i], item)) {
                return i;
            }
        }
        return -1;
    }

    public void removeItem(String item) {
        boolean found = false;
        for (int i = 0; i < MAX_ITEMS; i++) {
            if (Objects.equals(inventory[i], item)) {
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
        String result = "";
        for (int i = 0; i < MAX_ITEMS; i++) {
            result += inventory[i] + " ";
        }

        return result;
    }
}
