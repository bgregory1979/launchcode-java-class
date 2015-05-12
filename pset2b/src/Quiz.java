import java.util.Scanner;

/**
 * Created by brian on 5/8/15.
 */

public class Quiz {
    public Question[] questions;
    public String[][] answers;

    public Quiz(Question[] questions, String[][] answers) {
        this.questions = questions;
        this.answers = answers;
    }

    public Question[] getQuestions() {
        return this.questions;
    }

    public String[][] getAnswers() {
        return answers;
    }

    public void administrate() {
        double score = 0.0;
        for (int i = 0; i < questions.length; i++) {
            score = score + questions[i].runQuestion();
        }
        System.out.println("Your total score is: " + String.format("%.2f", score) + " out of " + questions.length + ".");
    }

    public static void main(String[] args) {
        String[] ansA = {"Barack Obama"};
        FillorNumeric a = new FillorNumeric("Who is the president of the United States?", ansA);
        String[] ansB = {"2015"};
        FillorNumeric b = new FillorNumeric("What is the current year?", ansB);
        String[] ansC = {"D"};
        MultipleChoice c = new MultipleChoice("Where in the world is Carmen San Diego?\nA: Berlin\nB: New York\nC: Paris\nD: San Diego\n", ansC);
        String[] ansD = {"A", "C", "D"};
        MultipleChoice d = new MultipleChoice("Which of the following persons were presidents?\nA: Barack Obama\nB: Steve Urkel\nC: Bill Clinton\nD: George Bush\n", ansD);
        Question[] questions = {a, b, c, d};
        String[][] answers = {ansA, ansB, ansC, ansD};
        double score = 0.0;
        Quiz quizzz = new Quiz(questions, answers);
        quizzz.administrate();

    }
}

