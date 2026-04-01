import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * =============================================================================
 * MAIN CLASS - UseCase12FilePersistence
 * =============================================================================
 * Use Case 12: Application Persistence
 * * This class demonstrates how to save guest data to a file and read it back
 * using BufferedWriter and BufferedReader.
 */
 class UseCase12FilePersistence {

    public static void main(String[] args) {
        String fileName = "bookings.txt";
        String guestData = "Guest: Alice, Room: 101, Status: Confirmed";

        System.out.println("Hotel Management - Data Persistence Module\n");

        // 1. Writing data to a file (Saving)
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            System.out.println("Saving booking data to " + fileName + "...");
            writer.write(guestData);
            System.out.println("Data saved successfully.");
        } catch (IOException e) {
            System.err.println("Error while saving: " + e.getMessage());
        }

        System.out.println("------------------------------------------------");

        // 2. Reading data from the file (Loading)
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            System.out.println("Reading data back from " + fileName + ":");
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("Loaded Record: " + line);
            }
        } catch (IOException e) {
            System.err.println("Error while reading: " + e.getMessage());
        }

        System.out.println("\nPersistence test completed.");
    }
}