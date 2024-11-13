
import CIE.Internals;
import SEE.External;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Number of students
        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();
        scanner.nextLine();  // Consume the newline

        // Loop through each student
        for (int i = 0; i < n; i++) {
            // Read student details
            System.out.println("\nEnter details for Student " + (i + 1) + ":");

            System.out.print("Enter USN: ");
            String usn = scanner.nextLine();

            System.out.print("Enter Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Semester: ");
            int sem = scanner.nextInt();

            // Input internal marks for 5 courses
            int[] internalMarks = new int[5];
            System.out.println("Enter Internal Marks for 5 Courses:");
            for (int j = 0; j < 5; j++) {
                System.out.print("Course " + (j + 1) + ": ");
                internalMarks[j] = scanner.nextInt();
            }

            // Input external marks for 5 courses
            int[] externalMarks = new int[5];
            System.out.println("Enter External Marks for 5 Courses:");
            for (int j = 0; j < 5; j++) {
                System.out.print("Course " + (j + 1) + ": ");
                externalMarks[j] = scanner.nextInt();
            }
            scanner.nextLine();  // Consume the newline after integer input

            // Create Internals and External objects for the student
            Internals internalStudent = new Internals(usn, name, sem, internalMarks);
            External externalStudent = new External(usn, name, sem, externalMarks);

            // Print the internal and external marks for the student
            internalStudent.printInternalMarks();
            externalStudent.printExternalMarks();

            // Print final marks for the student
            printFinalMarks(internalStudent, externalStudent);
        }

        scanner.close();
    }

    // Method to calculate and print final marks (internal + external)
    public static void printFinalMarks(Internals internal, External external) {
        int[] internalMarks = internal.internalMarks;
        int[] externalMarks = external.externalMarks;
        int totalMarks;

        System.out.println("Final Marks for " + internal.getName() + " (" + internal.getUsn() + "):");
        for (int i = 0; i < internalMarks.length; i++) {
            totalMarks = internalMarks[i] + externalMarks[i];
            System.out.println("Course " + (i + 1) + ": " + totalMarks);
        }
    }
}

