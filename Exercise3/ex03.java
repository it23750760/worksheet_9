import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ex03 {
    public static void main(String[] args) {
        Set<Double> uniqueHeights = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter heights of 10 students (in meters):");
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter height for student " + (i + 1) + ": ");
            double height = scanner.nextDouble();
            uniqueHeights.add(height);
        }

        // Display unique heights
        System.out.println("\nUnique heights in the class:");
        for (Double height : uniqueHeights) {
            System.out.printf("%.2f meters\n", height);
        }

        scanner.close();
    }
}