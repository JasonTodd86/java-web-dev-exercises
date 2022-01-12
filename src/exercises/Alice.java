package exercises;
import java.util.Locale;
import java.util.Scanner;

public class Alice {

    public static void main(String[] args) {

        String firstLine = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: " +
                "once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, " +
                "'and what is the use of a book,' thought Alice 'without pictures or conversation?'";

        String lowercaseText = firstLine.toLowerCase();
//        System.out.println(lowercaseText);
        Scanner input = new Scanner(System.in);

        System.out.println("What are you searching for?");
        String search = input.nextLine().toLowerCase();

        Boolean searchResult = lowercaseText.contains(search);
        System.out.println("Does the first line contain what you've search for? That is " + searchResult + ".");

        Integer index = lowercaseText.indexOf(search);
        Integer length = search.length();
        System.out.println("The search term is at the " + index + " index of the sentence. It's length is " + length + " of characters.");
        String modifiedString = lowercaseText.replace(search, "");
        System.out.println(modifiedString);
    }
}