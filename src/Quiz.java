import java.util.List;
import java.util.Scanner;

public class Quiz {
    private String name;
    private List<Question> questions;

    public Quiz(String name, List<Question> questions) {

        this.name = name;
        this.questions = questions;
    }

    public String getName() {
        return name;
    }

    public int startQuiz() {
        Scanner scanner = new Scanner(System.in);
        int correctAnswers = 0;

        System.out.println("\nWelcome to the " + name + " quiz!");
        System.out.println("Answer the following questions:");

        for (Question question : questions) {
            System.out.println(question);
            System.out.println("Your answer: ");
            String userAnswer = scanner.nextLine();
            if (question.isCorrect(userAnswer)) {
                System.out.println("Correct!");
                correctAnswers++;
            } else {
                System.out.println("Wrong! Correct answer: " + question.getCorrectAnswer());
            }
        }

            System.out.println("\nYou got " + correctAnswers + " out of " + questions.size() + " correct.");
            return correctAnswers;
        }
    }



