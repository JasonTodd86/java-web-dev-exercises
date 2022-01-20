package exercises;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class chapterThree {
    public static void main(String[] args) {
        ArrayList<Integer> someIntegers = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 88, 99));
        System.out.println(sumEvenNumbers(someIntegers));
    }

    public static int sumEvenNumbers(ArrayList<Integer> arr) {
        int total = 0;
        for (int integer : arr) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }
        return total;
    }

    public static void pringFiveLetterWords(ArrayList<String> array, int length){
        for(String word: array){
            if(word.length() == length){
                System.out.println();
            }
        }
    }
}








