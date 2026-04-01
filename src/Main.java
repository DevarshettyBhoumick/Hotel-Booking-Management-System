import java.util.HashSet;
import java.util.Set;

/**
 * =============================================================================
 * MAIN CLASS - UseCase4RoomUniqueManagement
 * =============================================================================
 * Use Case 4: Unique Room Management
 * * This class demonstrates how a Set is used to maintain a collection of
 * unique room numbers, preventing duplicates in the system.
 */
class UseCase4RoomUniqueManagement {

    public static void main(String[] args) {
        // 1. Initialize a Set to store unique Room Numbers
        // A HashSet is used because it does not allow duplicate elements.
        Set<String> roomNumbers = new HashSet<>();

        System.out.println("Hotel Room Inventory Management\n");

        // 2. Adding unique rooms to the system
        System.out.println("Adding rooms to the inventory...");
        roomNumbers.add("Room 101");
        roomNumbers.add("Room 102");
        roomNumbers.add("Room 103");

        // 3. Attempting to add a duplicate room
        System.out.println("Attempting to add duplicate 'Room 101'...");
        boolean isAdded = roomNumbers.add("Room 101");

        if (!isAdded) {
            System.out.println("Error: Room 101 already exists in the system.");
        }

        // 4. Display current unique inventory
        System.out.println("\nCurrent Unique Room Inventory:");
        for (String room : roomNumbers) {
            System.out.println("- " + room);
        }

        // 5. Verification
        System.out.println("\nTotal unique rooms managed: " + roomNumbers.size());
    }
}