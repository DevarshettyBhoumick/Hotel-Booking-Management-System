import java.util.PriorityQueue;
import java.util.Queue;

/**
 * =============================================================================
 * MAIN CLASS - UseCase7PriorityBooking
 * =============================================================================
 * Use Case 7: High-Priority Bookings
 * * This class demonstrates how a PriorityQueue is used to handle requests
 * based on importance (Natural Ordering) rather than just arrival time.
 */
class UseCase7PriorityBooking {

    public static void main(String[] args) {
        // 1. Initialize a PriorityQueue
        // In this example, String natural ordering (Alphabetical) determines priority.
        // In a real app, you would use a custom object with a priority level.
        Queue<String> priorityRequests = new PriorityQueue<>();

        System.out.println("Hotel Management - Priority Booking System\n");

        // 2. Adding requests to the priority queue
        // Note: PriorityQueue orders elements based on their natural order (A-Z)
        System.out.println("Adding guests to the priority system...");
        priorityRequests.add("VIP_Alice");
        priorityRequests.add("Standard_Bob");
        priorityRequests.add("VIP_Charlie");
        priorityRequests.add("Standard_David");

        System.out.println("Total requests waiting: " + priorityRequests.size() + "\n");

        // 3. Processing requests based on priority
        System.out.println("Processing requests (Ordered by Priority):");

        while (!priorityRequests.isEmpty()) {
            // poll() removes the head of the queue (the one with the highest priority)
            String processedGuest = priorityRequests.poll();
            System.out.println("Processing: " + processedGuest);
        }

        // 4. Final verification
        System.out.println("\nAll high-priority and standard requests processed.");
    }
}