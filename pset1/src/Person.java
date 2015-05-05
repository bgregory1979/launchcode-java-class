/**
 * Created by brian on 5/4/15.
 */
public class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getName() {
        return (this.firstName + " " + this.lastName);
    }

    public static void main(String[] args) {

    }
}
