package com.company.Tasks.BasicOfPrograming;

import java.util.Scanner;

public class substringCounter {
    public void task() {
        System.out.println("Input sentence: ");
        Scanner sentence = new Scanner(System.in);
        //System.out.println("For enter press Ctrl+D or Ctrl+C.");

        wordsFromSentence(sentence);
    }

    public static void wordsFromSentence(Scanner sentence) {
        int words = 0, letters = 0, lines = 0, wordRepeating = 0;
        String word;
        String sentenceLine, lookingWord="";

        if (sentence.hasNextLine()) {
            System.out.println("Input word for looking in sentence.");
            Scanner userWordInput = new Scanner(System.in);
            System.out.println("For enter press Ctrl+D or Ctrl+C.");
            lookingWord = userWordInput.nextLine();
        }


        while (sentence.hasNextLine()) {
            sentenceLine = sentence.nextLine();
            //System.out.println(sentenceLine);
            Scanner line = new Scanner(sentenceLine);
            letters += countLength(sentenceLine);
            lines++;
            while (line.hasNext()) {
                word = line.next();
                words++;
                if (word.contains(lookingWord)) {
                    wordRepeating++;
                }
            }
            if (!sentence.hasNextLine()) {
                System.out.println();
                System.out.println("--------STATISTICS---------");
                System.out.println("Words: "+words);
                System.out.println("Letters: " + letters);
                System.out.println("Lines: " + lines);
                System.out.println(lookingWord + " repeating: " + wordRepeating);
            }
        }
    }

    public static int countLength(String input) {
        int counter = 0;
        for (char c : input.toCharArray()) {
            counter++;
        }
        return counter;
    }
}
