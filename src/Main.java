import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * =============================================================================
 * MAIN CLASS - UseCase8RoomFiltering
 * =============================================================================
 * Use Case 8: Room Search & Filtering
 * * This class demonstrates using Java Streams to filter a collection of
 * room prices and find options within a specific budget.
 */
 class UseCase8RoomFiltering {

    public static void main(String[] args) {
        // 1. Initialize a list of room prices
        List<Double> roomPrices = new ArrayList<>();
        roomPrices.add(1500.0);
        roomPrices.add(2500.0);
        roomPrices.add(5000.0);
        roomPrices.add(1200.0);
        roomPrices.add(3500.0);

        System.out.println("Hotel Booking - Advanced Room Search\n");
        System.out.println("All available prices: " + roomPrices);

        // 2. Define the budget filter
        double maxBudget = 3000.0;
        System.out.println("Filtering rooms with price <= " + maxBudget + "...\n");

        // 3. Using Java Streams to filter the list
        // .stream() - converts list to a stream
        // .filter() - checks the condition
        // .collect() - converts the stream back into a List
        List<Double> affordableRooms = roomPrices.stream()
                .filter(price -> price <= maxBudget)
                .collect(Collectors.toList());

        // 4. Display the filtered results
        if (affordableRooms.isEmpty()) {
            System.out.println("No rooms found within your budget.");
        } else {
            System.out.println("Rooms found within budget:");
            affordableRooms.forEach(price -> System.out.println("- Price: " + price));
        }

        // 5. Final Count
        System.out.println("\nTotal affordable options: " + affordableRooms.size());
    }
}