public class Question {
    protected String questionText;
    protected String correctAnswer;

    public Question(String questionText, String correctAnswer) {
        this.questionText = questionText;
        this.correctAnswer = correctAnswer;
    }

    //Checking correct answer
    public boolean isCorrect(String userAnswer) {
        return correctAnswer.equalsIgnoreCase(userAnswer);
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }
    @Override
    public String toString() {
        return questionText;
    }
}
