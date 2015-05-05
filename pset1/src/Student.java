/**
 * Created by brian on 4/29/15.
 */
public class Student extends Person {
    private int studentId;
    private double credits;
    private double gpa;


    public Student(String firstName, String lastName, int studentId, double credits, double gpa) {
        super(firstName, lastName);
        this.studentId = studentId;
        this.credits = credits;
        this.gpa = gpa;
    }

    public Student(String firstName, String lastName, int studentId) {
        super(firstName, lastName);
        this.studentId = studentId;
        this.credits = 0.0;
        this.gpa = 0.0;
    }

    public int getStudentId() {
        return this.studentId;
    }

    public double getCredits() {
        return this.credits;
    }

    public double getGPA() {
        return this.gpa;
    }

    public void setCredits(double credits) {
        this.credits = credits;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String toString() {
        return (this.getName() + this.studentId);
    }

    public String getClassStanding() {

        double creds = this.getCredits();

        if (creds < 30) {
            return "freshman";
        } else if (creds >= 30 && creds < 60) {
            return "sophomore";
        } else if (creds >= 60 && creds < 90) {
            return "junior";
        } else {
            return "senior";
        }
    }

    public double submitGrade(int grade, int numCredits) {
        this.gpa = ((grade * numCredits) + (this.gpa * this.credits)) / (this.credits + numCredits);
        this.credits = this.credits + numCredits;
        return this.gpa;
    }

    public Student createLegacy(Student a) {

        int newID = (int)(Math.random() * 900000 + 100000);

        double newCredits;

        if (this.credits > a.getCredits()) {
            newCredits = this.credits;
        }
        else {
            newCredits = a.getCredits();
        }

        double newGPA = (this.gpa + a.getGPA()) / 2;

        Student abc = new Student(this.getName(), a.getName(), newID, newCredits, newGPA);

        return abc;
    }

    public static void main(String args[]) {

        Student xyz = new Student("Joe", "Schmoe", 123456, 25, 3.5);

        Student foo = new Student("Jane", "Doe", 234567, 20, 2.5);

        xyz.toString();

        xyz.getClassStanding();

        xyz.submitGrade(3, 3);

        // xyz.computeTuition();

        Student abc = xyz.createLegacy(foo);
    }
}