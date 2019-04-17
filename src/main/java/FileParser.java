import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yana on 17.04.2019.
 */
public class FileParser {

    public static void doParser() throws IOException {
        String filePath = "D:\\AutoTestingProjects\\TheDataForTheProject\\data.txt";
        File file = new File(filePath);
        FileInputStream fileInputStream = new FileInputStream(file);
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        Questions questions = new Questions();
        List<Questions> questionsList = new ArrayList<Questions>();

        List<String> result = new ArrayList<String>();

        Answers answers = new Answers();
        List<Answers> answersList = new ArrayList<Answers>();

        String line;
        while ((line = bufferedReader.readLine()) != null){
//            if (line.contains("Question")){
//                questions.setQuestion(line);
//                questionsList.add(questions);
//            } else {
//                answers.setAnswer(line);
//                answersList.add(answers);
//            }
            result.add(line);

//            System.out.println(line);
        }
//        questions.setQuestionsList(questionsList);
//
        for (String s : result) {
            if (s.contains("Question")){
                questions.setQuestion(s);
            }
            questionsList.add(questions);
        }
        for (Questions questions1 : questionsList) {
            System.out.println(questions1.getQuestion());
        }
    }

}
