import java.util.Scanner;

/**
 * Created by brian on 5/5/15.
 */
public class FillorNumeric extends Question {

    public FillorNumeric(String question, String[] answerKey) {
        super(question, answerKey);
    }
/*
    public double checkAnswer(String response) {
        double scoreCount = 0.0;
        for (int i = 0; i < this.getAnswer().length ; i++) {
            if (response.equalsIgnoreCase(this.getAnswer()[i])) {
                scoreCount += 1.0;
            }
        }
        System.out.println("You scored a " + scoreCount + " out of " + this.getAnswer().length + ".");
        return (scoreCount / this.getAnswer().length);
    }

    public double runQuestion() {
        Scanner Scan = new Scanner(System.in);
        System.out.println(this.getQuestion());
        System.out.print("Enter your answer: ");
        String response = Scan.nextLine();
        System.out.println();
        return this.checkAnswer(response);
    }
*/
    public static void main(String[] args) {
        String[] answerKey = {"Barack Obama"};
        FillorNumeric a = new FillorNumeric("Who is the president of the United States?", answerKey );
        a.runQuestion();
        answerKey[0] = "2015";
        FillorNumeric b = new FillorNumeric("What is the current year?", answerKey);
        b.runQuestion();


    }
}
