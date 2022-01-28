package studios.FunWithQuizes;

import java.util.ArrayList;
import java.util.Scanner;

public class MultipleChoice extends Question {

    private ArrayList<String> possibleAnswers;
    private int correctAnswer;

    public MultipleChoice(int pointValue, String text, int correctAnswer, ArrayList<String> possibleAnswers) {
        super(pointValue, text);
        this.correctAnswer = correctAnswer;
        this.possibleAnswers = possibleAnswers;
        setPointValue(1);
    }

    @Override
    public void displayAnswers () {
        for (int i = 0; i < possibleAnswers.size(); i++) {
            System.out.println(possibleAnswers.get(i));
        }
    }

    public boolean isCorrectAnswer (int possibleAnswerIndex) {
        if (possibleAnswerIndex == correctAnswer) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public int getAnswers() {
        Scanner answer = new Scanner(System.in);
        System.out.println("What will your answer be? Enter the number of the option you believe is correct. For example, to select the first option, enter 1");
        String userAnswer = answer.nextLine();
        int result = Integer.parseInt(userAnswer);
        if (isCorrectAnswer(result)) {
            return 1;
        }
        else {
            return 0;
        }
    }

}

//
//    public String choiceA;
//    public String choiceB;
//    public String choiceC;
//    public String choiceD;
//
//    MultiChoice(String prompt, String answer, String choiceA, String choiceB, String choiceC, String choiceD){
//        super(prompt, answer);
//        this.choiceA = choiceA;
//        this.choiceB = choiceB;
//        this.choiceC = choiceC;
//        this.choiceD = choiceD;
//    }

