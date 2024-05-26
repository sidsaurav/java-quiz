class Question {
  private int id;
  private String question;
  private String[] options;
  private String answer;

  public Question(int id, String question, String[] options, String answer) {
    this.id = id;
    this.question = question;
    this.options = options;
    this.answer = answer;
  }

  public int getId() {
    return this.id;
  }

  public String getQuestion() {
    return this.question;
  }

  public String[] getOptions() {
    return this.options;
  }

  public String getAnswer() {
    return this.answer;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setQuestion(String question) {
    this.question = question;
  }

  public void setOptions(String[] options) {
    this.options = options;
  }

  public void setAnswer(String answer) {
    this.answer = answer;
  }

  @Override
  public String toString() {
    return "Question{" +
        "id=" + id +
        ", question='" + question + '\'' +
        ", answer='" + answer + '\'' +
        ", options=" + options[0] + "," + options[1] + "," + options[2] + "," + options[3] +
        '}';
  }
}
