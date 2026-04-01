/**
 * =============================================================================
 * MAIN CLASS - UseCase11SystemShutdown
 * =============================================================================
 * Use Case 11: System Shutdown & Cleanup
 * * This class represents the final stage of the application lifecycle.
 * * It displays a closing message and ensures all resources are
 * considered "released" before the program terminates.
 */
 class UseCase11SystemShutdown {

    public static void main(String[] args) {
        // 1. Final status report
        System.out.println("Hotel Booking Management System - Shutdown Sequence\n");

        // 2. Simulating resource cleanup
        // In a full app, this would involve closing Files or Database Connections
        System.out.println("Closing active sessions...");
        System.out.println("Saving final logs...");
        System.out.println("Releasing system resources...");

        // 3. Final Farewell Message
        System.out.println("\n================================================");
        System.out.println("Thank you for using the Book My Stay Application!");
        System.out.println("System shut down successfully.");
        System.out.println("================================================\n");

        // 4. Explicit exit (Optional, but good for clarity in multi-threaded apps)
        System.exit(0);
    }
}