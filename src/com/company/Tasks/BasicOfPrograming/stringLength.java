package com.company.Tasks.BasicOfPrograming;

import java.util.Scanner;

public class stringLength {
    public void task() {
        System.out.println("Input sentence to length count: ");
        System.out.println("Pres Ctrl+D or Ctrl+C for end program.");
        Scanner input = new Scanner(System.in);

        wordsFromSentence(input);
    }
    public static void wordsFromSentence(Scanner sentence) {
        int words = 0, letters = 0, lines = 0;
        String word;
        String sentenceLine;


        while (sentence.hasNextLine()) {
            sentenceLine = sentence.nextLine();
            //System.out.println(sentenceLine);
            Scanner line = new Scanner(sentenceLine);
            letters += countLength(sentenceLine);
            lines++;
            if (!sentence.hasNextLine()) {
                System.out.println();
                System.out.println("--------STATISTICS---------");
                System.out.println("Letters: "+letters);
                System.out.println("Lines: "+lines);
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
