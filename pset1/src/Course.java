/**
 * Created by brian on 4/29/15.
 */
public class Course {
    private String courseName;
    private double credits;
    private int seats;
    private Student[] studentRoster;
    private Instructor teacher;


    public Course(String courseName, double credits, int seats, Instructor teacher) {
        this.courseName = courseName;
        this.credits = credits;
        this.seats = seats;
        this.studentRoster = new Student[seats];
        this.teacher = teacher;
    }

    public Course(String courseName, double credits, int seats) {
        this.courseName = courseName;
        this.credits = credits;
        this.seats = seats;
        this.studentRoster = new Student[seats];
    }

    public String getCourseName() {
        return this.courseName;
    }

    public double getCredits() {
        return this.credits;
    }

    public int getSeats() {
        return this.seats;
    }

    public void setInstructor(Instructor x) {
        this.teacher = x;
    }
    public Instructor getInstructor() {
        return this.teacher;
    }

    public String toString() {
        // System.out.println("Course name: " + this.courseName + "\nCredits: " + this.credits + "\n");
        return (this.courseName + this.credits);
    }

    public boolean addStudent(Student a) {
        for (int i = 0; i < this.seats; i++) {
            if (this.studentRoster[i] != null) {
                if ((this.studentRoster[i].getName()).equals(a.getName())) {
                    System.out.println("This student has already been enrolled.");
                    return false;
                }
            }
        }
        for (int j = 0; j < this.seats; j++)
            if (this.studentRoster[j] == null) {
                this.studentRoster[j] = a;
                System.out.println("The student has been enrolled.");
                return true;
            }
        System.out.println("The class is full.");
        return false;
    }

    public void printRoster() {
        for (int i = 0; i < this.seats; i++) {
            if (this.studentRoster[i] != null) {
                System.out.println(this.studentRoster[i].getName());
            }
        }
    }

    public double averageGPA() {
        double gpaCount = 0.0;
        int numStudents = 0;
        for (int i = 0; i < this.seats; i++) {
            if (this.studentRoster[i] != null) {
                numStudents++;
                gpaCount = gpaCount + this.studentRoster[i].getGPA();
                //System.out.println(numStudents);
                //System.out.println(this.studentRoster[i].getGPA());
            }
        }
        // System.out.println(gpaCount / numStudents);
        return (gpaCount / numStudents);
    }

    public static void main(String args[]) {
        Course abc = new Course("Math 101", 3.0, 30);
        // System.out.println(abc.credits);
        // System.out.println(abc.courseName);
        // System.out.println(abc.seats);
        // System.out.println(a.studentRoster);
        abc.toString();
        Instructor xyz = new Instructor("Ben", "Dover", 3, 2);
        Student a = new PTstudent("Joe", "Schmoe", 123456, 25, 3.5);
        Student b = new FTstudent("Al", "Coholic", 345678, 31, 3.3);
        Student c = new PTstudent("Jane", "Doe", 234567, 20, 2.5);
        Student d = new FTstudent("Ivana", "Tinkle", 456789, 28, 2.6);
        abc.setInstructor(xyz);
        abc.addStudent(a);
        abc.addStudent(b);
        abc.addStudent(c);
        abc.addStudent(d);
        abc.printRoster();
        abc.averageGPA();
    }
}