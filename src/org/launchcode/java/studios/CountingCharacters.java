package org.launchcode.java.studios;

import java.lang.reflect.Array;
import java.util.Locale;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class CountingCharacters {
    public static void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in);
        System.out.println("Howdy. Please enter a string.");
        String myString = input.nextLine();
        myString = myString.toLowerCase(Locale.ROOT).replaceAll("^a-z", "");
        char[] myStringChar = myString.toCharArray();
        loop(myStringChar);
        input.close();
        System.out.println("Thanks for the string!");
    }

    public static void loop(char[] letters) {
        HashMap<Character, Integer> letterCounts = new HashMap<>();
        for (char c : letters) {
            if (letterCounts.containsKey(c)) {
                int currentCount = letterCounts.get(c);
                currentCount++;
                letterCounts.put(c, currentCount);
            } else {
                letterCounts.put(c, 1);
            }
        }

        System.out.println("\n*****");
        for (Map.Entry<Character, Integer> letter : letterCounts.entrySet()) {
            System.out.println(letter.getKey() + ":" + letter.getValue());
        }
    }


}


