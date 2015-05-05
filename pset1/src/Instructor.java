/**
 * Created by brian on 5/5/15.
 */
public class Instructor extends Person {
    private int yearsTenure;
    private int numClasses;
    private Course[] coursesTaught;

    public Instructor(String firstName, String lastName, int years, int numClasses) {
        super(firstName, lastName);
        this.yearsTenure = years;
        this.numClasses = numClasses;
        this.coursesTaught = new Course[numClasses];
    }

    public int getTenure() {
        return this.yearsTenure;
    }

    public int getNumClasses() {
        return this.numClasses;
    }

    public boolean addCourse(Course a) {
        for (int i = 0; i < this.numClasses; i++) {
            if (this.coursesTaught[i] != null) {
                if ((this.coursesTaught[i].getCourseName()).equals(a.getCourseName())) {
                    System.out.println("This instructor is already teacher this course.");
                    return false;
                }
            }
        }
        for (int j = 0; j < this.numClasses; j++)
            if (this.coursesTaught[j] == null) {
                this.coursesTaught[j] = a;
                System.out.println("The course has been added to the instructor's schedule.");
                return true;
            }
        System.out.println("The instructor's schedule is full.");
        return false;
    }

    public static void main(String[] args) {
        Instructor xyz = new Instructor("Ben", "Dover", 3, 2);
        Course abc = new Course("Math 101", 3.0, 30);
        Course bcd = new Course("Math 102", 4.0, 25);
        Course cde = new Course("Math 103", 4.0, 20);
        xyz.addCourse(abc);
        xyz.addCourse(bcd);
        xyz.addCourse(cde);
    }
}
