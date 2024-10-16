import java.util.Scanner;

class Student {
    String usn;
    String name;
    int[] credits;
    int[] marks;

        public Student(int numSubjects) {
        credits = new int[numSubjects];
        marks = new int[numSubjects];
    }

      void acceptDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter USN: ");
        usn = sc.nextLine();  // Using nextLine to capture full input
        System.out.print("Enter Name: ");
        name = sc.nextLine(); // Using nextLine to capture full input

        System.out.println("Enter credits and marks for each subject:");
        for (int i = 0; i < credits.length; i++) {
            System.out.print("Credits for subject " + (i + 1) + ": ");
            credits[i] = sc.nextInt();
            System.out.print("Marks for subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }
    }

        void displayDetails() {
        System.out.println("USN: " + usn);
        System.out.println("Name: " + name);
        for (int i = 0; i < credits.length; i++) {
            System.out.println("Subject " + (i + 1) + " - Credits: " + credits[i] + ", Marks: " + marks[i]);
        }
        System.out.printf("SGPA: %.2f%n", calculateSGPA());
    }

 
    double calculateSGPA() {
        double totalCredits = 0;
        double totalPoints = 0;

        for (int i = 0; i < credits.length; i++) {
            double gradePoint = calculateGradePoint(marks[i]);
            totalPoints += gradePoint * credits[i];
            totalCredits += credits[i];
        }

        return totalCredits > 0 ? totalPoints / totalCredits : 0;
    }

       double calculateGradePoint(int mark) {
        if (mark >= 90) return 10;
        else if (mark >= 80) return 9;
        else if (mark >= 70) return 8;
        else if (mark >= 60) return 7;
        else if (mark >= 50) return 6;
        else if (mark >= 40) return 5;
        else return 0; // Fail
    }
}

public class StudentSGPACalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of subjects: ");
        int numSubjects = sc.nextInt();
        sc.nextLine();  
        Student student = new Student(numSubjects);
        student.acceptDetails();
        student.displayDetails();

        sc.close();
    }
}
