import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class QuizApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Question> mathQuestions = Arrays.asList(
                new SingleChoiceQuestion("What is 2 + 2?", Arrays.asList("3","4","5","6"), "B"),
                new OpenEndedQuestion("What is the square root of 16?", "4"),
                new SingleChoiceQuestion("What is 7 * 8?", Arrays.asList("54","56","58","60"), "B"));

        List<Question> scienceQuestions = Arrays.asList(
                new SingleChoiceQuestion("What is H2O?", Arrays.asList("Hydrogen","Water","Oxygen","Helium"), "B"),
                new OpenEndedQuestion("What planet is known as a Red Planet?", "Mars"),
                new SingleChoiceQuestion("What is the chemical symbol for gold?", Arrays.asList("Ag","Au","Pb","Pt"), "B")
        );

        List<Quiz> quizzes = Arrays.asList(
                new Quiz("Math Quiz", mathQuestions),
                new Quiz("Science Quiz", scienceQuestions)
        );

        while (true) {
            System.out.println("\nChoose a quiz:");
            for (int i = 0; i < quizzes.size(); i++) {
                System.out.println((i + 1) + ". " + quizzes.get(i).getName());
            }
            System.out.println("0. Exit");

            System.out.println("Your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 0) {
                System.out.println("Thank you for playing!");
                break;
            } else if (choice > 0 && choice <= quizzes.size()) {
                quizzes.get(choice - 1).startQuiz();
            } else {
                System.out.println("Invalid choice. Try again.");
            }
        }

        scanner.close();
    }
}
