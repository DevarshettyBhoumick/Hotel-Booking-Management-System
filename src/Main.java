import java.util.ArrayList;
import java.util.List;

/**
 * =============================================================================
 * MAIN CLASS - UseCase6DynamicInventory
 * =============================================================================
 * Use Case 6: Dynamic Inventory Management
 * * This class demonstrates the use of an ArrayList to manage a dynamic
 * list of room identifiers, allowing for flexible inventory updates.
 */
 class UseCase6DynamicInventory {

    public static void main(String[] args) {
        // 1. Initialize a List to store room identifiers
        // ArrayList allows for dynamic resizing as we add or remove rooms.
        List<String> roomInventory = new ArrayList<>();

        System.out.println("Hotel Inventory - Dynamic Management System\n");

        // 2. Adding rooms to the inventory (Initial setup)
        roomInventory.add("Room 101");
        roomInventory.add("Room 102");
        roomInventory.add("Room 103");
        System.out.println("Initial Inventory: " + roomInventory);

        // 3. Adding a new room dynamically
        System.out.println("Adding 'Room 104' to the system...");
        roomInventory.add("Room 104");

        // 4. Removing a room (e.g., room undergoing maintenance)
        System.out.println("Removing 'Room 102' for maintenance...");
        roomInventory.remove("Room 102");

        // 5. Checking the total count and searching
        System.out.println("\nCurrent Inventory Status:");
        System.out.println("Total rooms available: " + roomInventory.size());

        // 6. Iterating through the list to display all rooms
        System.out.println("List of available rooms:");
        for (String room : roomInventory) {
            System.out.println("- " + room);
        }

        // 7. Accessing a specific room by index (Position-based access)
        if (!roomInventory.isEmpty()) {
            System.out.println("\nFirst available room in list: " + roomInventory.get(0));
        }
    }
}