package CIE;

public class Student {
    protected String usn;
    protected String name;
    protected int sem;

    // Constructor to initialize student details
    public Student(String usn, String name, int sem) {
        this.usn = usn;
        this.name = name;
        this.sem = sem;
    }

    // Getter methods
    public String getUsn() {
        return usn;
    }

    public String getName() {
        return name;
    }

    public int getSem() {
        return sem;
    }
}
