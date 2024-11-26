import java.util.List;

public class SingleChoiceQuestion extends Question {
    private List<String> options;

    public SingleChoiceQuestion(String questionText, List<String> options, String correctAnswer) {
        super(questionText, correctAnswer);
        this.options = options;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        for (int i = 0; i < options.size(); i++) {
            sb.append("\n").append((char) ('A' + i)).append(". ").append(options.get(i));
        }
        return sb.toString();
    }
}
