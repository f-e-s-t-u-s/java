package Marks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("********************************************************");
        System.out.println("/t /t /t /t Student MarkList");
        System.out.println("********************************************************");

        System.out.println("enter no, of students:");
        int number = scanner.nextInt();
        List<Student> studentMarks = new ArrayList<>();

        for (int i = 0; i < number; i++) {
            System.out.print("Enter student's name: ");
            String name = scanner.nextLine();

            System.out.print("Enter mark for subject 1: ");
            double mark1 = scanner.nextDouble();

            System.out.print("Enter mark for subject 2: ");
            double mark2 = scanner.nextDouble();

            System.out.print("Enter mark for subject 3: ");
            double mark3 = scanner.nextDouble();
            Student student1 = new Student("Alice", 90);


        }

        // Close the scanner
        scanner.close();
    }
}

// System.out.print("Enter student's name: ");
// String name = scanner.nextLine();

// System.out.print("Enter mark for subject 1: ");
// double mark1 = scanner.nextDouble();

// System.out.print("Enter mark for subject 2: ");
// double mark2 = scanner.nextDouble();

// System.out.print("Enter mark for subject 3: ");
// double mark3 = scanner.nextDouble();

// Display the results in a table
// System.out.println("\nStudent Report Card");
// System.out.println("-------------------------------------------------");
// System.out.println("Name | Subject 1 | Subject 2 | Subject 3 | Total |
// Average");
// System.out.println("-------------------------------------------------");
// System.out.printf("%-15s | %.2f | %.2f | %.2f | %.2f | %.2f%n",
// name, mark1, mark2, mark3, totalMarks, average);
// System.out.println("-------------------------------------------------");

// Calculate the total marks and average
// double totalMarks = mark1 + mark2 + mark3;
// double average = totalMarks / 3.0;