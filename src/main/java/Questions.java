import java.util.List;

/**
 * Created by Yana on 17.04.2019.
 */
public class Questions {
    String question;
    List<Questions> questionsList;

    public List<Questions> getQuestionsList() {
        return questionsList;
    }

    public void setQuestionsList(List<Questions> questionsList) {
        this.questionsList = questionsList;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }
}
