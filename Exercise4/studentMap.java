import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class studentMap {
    public static void main(String[] args) {
        // Create a HashMap to store students with their IDs as keys
        Map<String, student> studentMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        // Add some sample students
        studentMap.put("S001", new student("S001", "John Doe", 3.5));
        studentMap.put("S002", new student("S002", "Jane Smith", 3.8));
        studentMap.put("S003", new student("S003", "Bob Johnson", 3.2));

        // Input student number and display details
        System.out.print("Enter student ID to search (e.g., S001): ");
        String searchID = scanner.nextLine();

        // Access student directly using the ID
        student foundStudent = studentMap.get(searchID);

        if (foundStudent != null) {
            System.out.println("\nStudent Details:");
            System.out.println(foundStudent);
        } else {
            System.out.println("Student with ID " + searchID + " not found.");
        }

        scanner.close();
    }
}