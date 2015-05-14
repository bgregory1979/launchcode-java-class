import java.util.HashMap;
import java.util.Scanner;
import java.io.FileNotFoundException;

/**
 * Created by brian on 5/5/15.
 */
public class Question {
    private String question;
    private String[] answerKey;

    public Question(String question, String[] answerKey) {
        this.question = question;
        this.answerKey = answerKey;
    }

    public String getQuestion() {
        return this.question;
    }

    public String[] getAnswer() {
        return answerKey;
    }

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
        return (scoreCount / this.getAnswer().length);
    }

    public String getUsersAnswer() throws NoInputException {
        Scanner Scan = new Scanner(System.in);
        String response = Scan.nextLine();
        if (response.equals("")) {
            throw new NoInputException("User answer can't be empty string");
        }
        return response;
    }

    public double runQuestion() {
        System.out.println(this.getQuestion());
        System.out.print("Enter your answer(s): ");
        String response = null;
        do {
            try {
                response = getUsersAnswer();
            } catch (NoInputException a) {
                System.out.println("Please enter an answer!");
            }
        }
        while (response == null);
        System.out.println();
        return this.checkAnswer(response);
    }
}
