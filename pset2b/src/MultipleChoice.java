import sun.jvm.hotspot.debugger.posix.elf.ELFSectionHeader;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by brian on 5/5/15.
 */
public class MultipleChoice extends Question {

    public MultipleChoice(String question, String[] answerKey) {
        super(question, answerKey);
    }
/*
    public double checkAnswer(String response) {
        double scoreCount = 0.0;
        if (this.getAnswer().length > 1) {
            String delimiters = "[ ,]+";
            String[] tokens = response.split(delimiters);
            for (int i = 0; i < tokens.length; i++) {
                for (int j = 0; j < this.getAnswer().length; j++) {
                    if (tokens[i].equalsIgnoreCase(this.getAnswer()[j])) {
                        scoreCount += 1.0;
                    }
                }
            }
        }
        else {
            for (int i = 0; i < this.getAnswer().length ; i++) {
                if (response.equalsIgnoreCase(this.getAnswer()[i])) {
                    scoreCount += 1.0;
                }
            }
        }
        System.out.println("You scored a " + scoreCount + " out of " + this.getAnswer().length + ".");
        return (scoreCount / this.getAnswer().length);
    }

    public double runQuestion() {
        Scanner Scan = new Scanner(System.in);
        System.out.println(this.getQuestion());
        System.out.print("Enter the letter(s) of your answer(s) - ");
        String response = Scan.nextLine();
        System.out.println();
        return this.checkAnswer(response);
    }
*/
    public static void main(String[] args) {
        String[] answerKey = {"A", "C", "D"};
        MultipleChoice a = new MultipleChoice("Which of the following persons were US presidents?\nA: Barack Obama\nB: Steve Urkel\nC: Bill Clinton\nD: George Bush\n", answerKey);
        a.runQuestion();
        /*
        Scanner Scan = new Scanner(System.in);
        System.out.println(a.getQuestion());
        System.out.print("Enter the letter(s) of your answer(s) - ");
        String response = Scan.nextLine();
        a.checkAnswer(response);
        */
    }
}
