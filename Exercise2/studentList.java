import java.util.ArrayList;

public class studentList {
    public static void main(String[] args) {
        // Create ArrayList with Student type using generics
        ArrayList<student> studentList = new ArrayList<>();

        // Add 3 Student objects
        studentList.add(new student("S001", "John Doe", 3.5));
        studentList.add(new student("S002", "Jane Smith", 3.8));
        studentList.add(new student("S003", "Bob Johnson", 3.2));

        // Display all student details
        System.out.println("Student Details:");
        for (student student : studentList) {
            System.out.println(student);
        }
    }
}