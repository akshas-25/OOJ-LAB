package SEE;

import CIE.Student;  // Importing Student class from the CIE package

public class External extends Student {
    public int[] externalMarks;

    // Constructor to initialize student details and external marks
    public External(String usn, String name, int sem, int[] externalMarks) {
        super(usn, name, sem);
        this.externalMarks = externalMarks;
    }

    // Method to print external marks
    public void printExternalMarks() {
        System.out.println("External Marks for " + name + " (" + usn + "):");
        for (int i = 0; i < externalMarks.length; i++) {
            System.out.println("Course " + (i + 1) + ": " + externalMarks[i]);
        }
    }
}
