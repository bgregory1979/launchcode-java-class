/**
 * Created by brian on 5/5/15.
 */
public class PTstudent extends Student {
    private double tuitionPerCredit;

    public PTstudent(String firstName, String lastName, int studentId, double credits, double gpa) {
        super(firstName, lastName, studentId, credits, gpa);
        this.tuitionPerCredit = 300.0;
    }

    public PTstudent(String firstName, String lastName, int studentId) {
        super(firstName, lastName, studentId);
        this.tuitionPerCredit = 300.0;
    }

    public double getTuition() {
        return this.tuitionPerCredit;
    }

    public double computeTuition() {
        return (this.getCredits() * this.getTuition());
    }

    public static void main(String[] args) {
        PTstudent xyz = new PTstudent("Joe", "Schmoe", 123456, 25, 3.5);

        PTstudent foo = new PTstudent("Jane", "Doe", 234567, 20, 2.5);

        xyz.toString();

        xyz.getClassStanding();

        xyz.submitGrade(3, 3);

        xyz.computeTuition();

        Student abc = xyz.createLegacy(foo);
    }
}
