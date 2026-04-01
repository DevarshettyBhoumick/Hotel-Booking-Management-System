/**
 * =============================================================================
 * MAIN CLASS - UseCase10ExceptionHandling
 * =============================================================================
 * Use Case 10: Handling Invalid Bookings
 * * This class demonstrates how to use try-catch blocks to handle potential
 * errors (Exceptions) without crashing the entire application.
 */
 class UseCase10ExceptionHandling {

    public static void main(String[] args) {
        System.out.println("Hotel Booking System - Error Handling Module\n");

        // Simulating a scenario where a user tries to access an invalid room ID
        String[] availableRooms = {"Room 101", "Room 102", "Room 103"};

        // We will try to access index 5, which does not exist (Array has only 3 items)
        int requestedIndex = 5;

        try {
            System.out.println("Attempting to access room details for ID at index: " + requestedIndex);

            // This line will trigger an ArrayIndexOutOfBoundsException
            String room = availableRooms[requestedIndex];

            System.out.println("Room found: " + room);

        } catch (ArrayIndexOutOfBoundsException e) {
            // This block catches the specific error and provides a solution
            System.err.println("ERROR: The requested room index (" + requestedIndex + ") is invalid.");
            System.out.println("REASON: We only have " + availableRooms.length + " rooms in this category.");
            System.out.println("ACTION: Please select a valid index between 0 and " + (availableRooms.length - 1));
        } finally {
            // The finally block always runs, regardless of whether an error occurred
            System.out.println("\nSearch process cleanup completed.");
        }

        System.out.println("\nSystem Status: The application is still running and stable.");
    }
}