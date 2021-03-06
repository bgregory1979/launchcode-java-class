import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;
/**
 * JUnit tests for Student and Course
 * @author dshook
 *
 */
public class StudentAndCourseTest extends TestCase {
	@Test
	public void testStudentInit() {
		FTstudent s = new FTstudent("Doug", "Shook", 111111, 14, 3);
		assertEquals("Doug Shook", s.getName());
		assertEquals(111111, s.getStudentId());
		//No credits, no GPA
		//assertEquals(0.0, s.getGPA());
		assertEquals(14.0, s.getCredits());
		assertEquals("freshman", s.getClassStanding());
		assertEquals(18666.66666, s.computeTuition(), .001);
		assertEquals(3.0, s.submitGrade(3, 3));
		Student xyz = new Student("Joe", "Schmoe", 123456, 25, 3.5);
		Student foo = new Student("Jane", "Doe", 234567, 20, 2.5);
		Student boo = xyz.createLegacy(foo);
		System.out.println(boo.getName());
		System.out.println(boo.getStudentId());
		System.out.println(boo.getCredits());
		System.out.println(boo.getGPA());

		// assertEquals();
		Instructor zyx = new Instructor("Ben", "Dover", 3, 2);
		Course abc = new Course("Math 101", 3.0, 30);
		Course bcd = new Course("Math 102", 4.0, 25);
		Course cde = new Course("Math 103", 4.0, 20);
		zyx.addCourse(abc);
		zyx.addCourse(bcd);
		zyx.addCourse(cde);
		//System.out.println(abc.credits);
		//System.out.println(abc.courseName);
		//System.out.println(abc.seats);
		// System.out.println(a.studentRoster);
		abc.toString();
		Student a = new PTstudent("Joe", "Schmoe", 123456, 25, 3.5);
		Student b = new FTstudent("Al", "Coholic", 345678, 31, 3.3);
		Student c = new PTstudent("Jane", "Doe", 234567, 20, 2.5);
		Student d = new FTstudent("Ivana", "Tinkle", 456789, 28, 2.6);
		abc.addStudent(a);
		abc.addStudent(b);
		abc.addStudent(c);
		abc.addStudent(d);
		abc.addStudent(a);
		abc.printRoster();
		abc.averageGPA();
        //Generate some random students, and test
		/*
		for (int i = 0; i < 20; ++i) {
			double a =  (Math.random() * 5000);
			double b =  (Math.random() * 5000);
			int c = (int)(Math.random() * 5000);
			Student s3 = new Student("" + a, "" + b, c);
			assertEquals(a + " " + b, s3.getName());
			//assertEquals(0.0, s3.getGPA());
			assertEquals(0.0, s3.getCredits());
		} */
	}

	//More tests should go here

}


