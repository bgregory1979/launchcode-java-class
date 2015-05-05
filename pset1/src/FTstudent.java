/**
 * Created by brian on 5/5/15.
 */
public class FTstudent extends Student {
    private double tuitionPerCredit;

    public FTstudent(String firstName, String lastName, int studentId, double credits, double gpa) {
        super(firstName, lastName, studentId, credits, gpa);
        this.tuitionPerCredit = 20000.0 / 15.0;
    }

    public FTstudent(String firstName, String lastName, int studentId) {
        super(firstName, lastName, studentId);
        this.tuitionPerCredit = 20000.0 / 15.0;
    }

    public double getTuition() {
        return this.tuitionPerCredit;
    }

    public double computeTuition() {
        return (this.getCredits() * this.getTuition());
    }

    public static void main(String args[]) {

        FTstudent xyz = new FTstudent("Joe", "Schmoe", 123456, 25, 3.5);

        FTstudent foo = new FTstudent("Jane", "Doe", 234567, 20, 2.5);

        xyz.toString();

        xyz.getClassStanding();

        xyz.submitGrade(3, 3);

        xyz.computeTuition();

        Student abc = xyz.createLegacy(foo);
    }
}
