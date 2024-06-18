package Day3Assignments;

import java.util.Scanner;

public class StudentDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        Student[] students = new Student[5];
 
        // Creating 5 students
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Student ID: ");
            int studentId = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Contact No: ");
            String contactNo = scanner.nextLine();
            System.out.print("Course: ");
            String course = scanner.nextLine();
            System.out.print("Fees: ");
            double fees = scanner.nextDouble();
            scanner.nextLine(); // Consume newline
 
            students[i] = new Student(studentId, name, contactNo, course, fees);
        }
 
        // Display student details course-wise
        System.out.println("\nDisplaying student details course-wise:");
        for (Student student : students) {
            System.out.println("\nCourse: " + student.getCourse());
            student.display();
        }
 
        // Calculate and display the total fees of all the students
        double totalFees = 0;
        for (Student student : students) {
            totalFees += student.getFees();
        }
        System.out.println("\nTotal fees of all students: " + totalFees);
    }
}