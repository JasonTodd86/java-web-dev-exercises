package studios.FunWithQuizes;

import java.util.ArrayList;
import java.util.Arrays;

public class QuizRunner {

    public static void main(String[] args) {
        Quiz myQuiz = new Quiz(new ArrayList<>());
        ArrayList<String> possAns1 = new ArrayList<>(Arrays.asList("Aragorn", "Gimli", "Legolas", "Boromir"));
        ArrayList<Integer> correctAns1 = new ArrayList<>(Arrays.asList(0,1));
        Checkbox newQuestion1 = new Checkbox(2, "Who is the best member of the Fellowship", possAns1, correctAns1);
        myQuiz.addQuestion(newQuestion1);
        ArrayList<String> possAns2 = new ArrayList<>(Arrays.asList("Merry", "Pippin", "Frodo", "Sam", "Gollum"));
        MultipleChoice newQuestion2 = new MultipleChoice(1, "Who was just the absolute worst", 4, possAns2);
        myQuiz.addQuestion(newQuestion2);
        TrueOrFalse newQuestion3 = new TrueOrFalse(1, "Is Gandalf overrated?", true);
        myQuiz.addQuestion(newQuestion3);

        myQuiz.runQuiz();

        myQuiz.gradeQuiz();
    }
}

//    public QuizRunner(String prompt, String answer) {
//        super(prompt, answer);
//    }
//
//    public static void main(String[] args) {
//
//        String question1 = "How many wings does a bird have?\n(a) Two\n(b) Six\n(c) Eighty thousand\n";
//        String question2 = "What is the tallest type of tree in the world?\n(a) Oaks\n(b) Redwoods\n(c) Sycamores\n";
//        String question3 = "What is the largest animal that has ever lived?\n(a) T-rex\n(b) Hamster\n(c) Blue whale\n";
//        String question4 = "Which of the following two animals are pachyderms?\n(a) Elephant\n(b) Rhinoceros\n(c) Turtle\n";
//
//        Question [] questions = {
//                new Question(question1, "a"),
//                new Question(question2, "b"),
//                new Question(question3, "c"),
//        };
////        Question [] questionCombos = {
////          new Question(question4, "a", "b")
////        };
//        //This needs to be a question that takes a correct combination of answers. How?
//        singleAnswers(questions);
//    }
//
//    public static void singleAnswers(Question [] questions){
//        int score = 0;
//        Scanner keyboardInput = new Scanner(System.in);
//        for(int i = 0; i < questions.length; i++){
//            System.out.println(questions[i].prompt);
//            String answer = keyboardInput.nextLine();
//            if(answer.equals(questions[i].answer)){
//                score ++;
//            }
//        }
//        System.out.println("Your score was " + score + " out of " + questions.length + "!");
//    }
//
//
//



