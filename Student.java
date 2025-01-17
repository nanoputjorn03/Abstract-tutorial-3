// ADT tutorial 3 Tat Putjorn 672115024

public class Student {
    private String studentID;
    private String studentName;
    private double gpa;

    public Student(String id, String name, double gpa) {
        this.studentID = id;
        this.studentName = name;
        this.gpa = gpa;
    }

    public String getStudentID() {
        return studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public double getGpa() {
        return gpa; 
    }

    public String toString() {
        return studentID + " " + studentName + " " + gpa;
    }
}