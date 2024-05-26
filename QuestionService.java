import java.util.Scanner;

public class QuestionService {
  Question questions[] = new Question[2];
  String optionsEntered[] = new String[2];

  QuestionService() {
    questions[0] = new Question(0, "What is Red", new String[] { "color", "day", "number", "object" }, "color");
    questions[1] = new Question(0, "What is 5", new String[] { "color", "day", "number", "object" }, "number");
  }

  public void displayQuestions() {
    for (int i = 0; i < questions.length; i++) {
      System.out.println(questions[i]);
      getAnswer(i);
    }
    showResult();
  }

  public void displayQuestion(int id) {
    System.out.println(questions[id]);
  }

  public void getAnswer(int id) {
    Scanner reader = new Scanner(System.in);
    optionsEntered[id] = reader.nextLine();
  }

  public void showResult() {
    int correct = 0;
    for (int i = 0; i < questions.length; i++) {
      System.out.println("entered " + optionsEntered[i] + " " + questions[i].getAnswer());
      if (optionsEntered[i].equals(questions[i].getAnswer())) {

        correct++;
      }
    }

    System.out.println("correct answers are " + correct + "/" + questions.length);
  }
}