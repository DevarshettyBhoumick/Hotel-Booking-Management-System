/**
 * =============================================================================
 * MAIN CLASS - UseCase9MultiThreadedBooking
 * =============================================================================
 * Use Case 9: Multi-Threaded Booking
 * * This class demonstrates how Java Threads are used to handle multiple
 * booking requests concurrently, simulating a high-traffic environment.
 */

// 1. Define the BookingTask class that implements Runnable
class BookingTask implements Runnable {
    private String guestName;

    public BookingTask(String guestName) {
        this.guestName = guestName;
    }

    // The run method contains the logic that will execute in a separate thread
    @Override
    public void run() {
        System.out.println("[Thread: " + Thread.currentThread().getName() +
                "] Processing booking for: " + guestName);

        try {
            // Simulate time taken for database processing or network delay
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            System.out.println("Booking interrupted for: " + guestName);
        }

        System.out.println("[Thread: " + Thread.currentThread().getName() +
                "] Booking COMPLETED for: " + guestName);
    }
}

 class UseCase9MultiThreadedBooking {

    public static void main(String[] args) {
        System.out.println("Hotel Booking System - Multi-Threaded Execution\n");

        // 2. Create multiple threads for different guests
        Thread thread1 = new Thread(new BookingTask("Alice"), "BookingThread-1");
        Thread thread2 = new Thread(new BookingTask("Bob"), "BookingThread-2");
        Thread thread3 = new Thread(new BookingTask("Charlie"), "BookingThread-3");

        // 3. Start the threads
        // These will run in parallel, not one after the other.
        System.out.println("Starting concurrent booking requests...\n");
        thread1.start();
        thread2.start();
        thread3.start();

        // 4. Main thread continues while background threads work
        System.out.println("Main Application Thread is free to handle other tasks.\n");
    }
}