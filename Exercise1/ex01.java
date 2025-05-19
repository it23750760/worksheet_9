import java.util.ArrayList;
import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // check if ArrayList is empty
        System.out.println("Is ArrayList empty? " + numbers.isEmpty());

        // adding 10 numbers from keyboard input
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers.add(scanner.nextInt());
        }

        // calculate total
        int total = 0;
        System.out.println("\nThe numbers in the ArrayList are:");
        for (int number : numbers) {
            total += number;
            System.out.print(number + " ");
        }

        System.out.println("\nTotal: " + total);
        scanner.close();
    }
}