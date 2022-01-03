package com.company.Tasks.BasicOfPrograming;

import java.util.Scanner;

public class wordsCounter {

    public static void task() {
        System.out.println("Input sentence to count: ");
        System.out.println("Pres Ctrl+D or Ctrl+C for end program.");
        Scanner input = new Scanner(System.in);

        countWords(input);
    }

    public static void countWords(Scanner sentence) {
        int words = 0, letters = 0, lines = 0;
        String word;
        String sentenceLine;


        while (sentence.hasNextLine()) {
            sentenceLine = sentence.nextLine();
            //System.out.println(sentenceLine);
            Scanner line = new Scanner(sentenceLine);
            letters += sentenceLine.length();
            lines++;
            while (line.hasNext()) {
                word = line.next();
                words++;
                System.out.println(word);
            }
            if (!sentence.hasNextLine()) {
                System.out.println();
                System.out.println("--------STATISTICS---------");
                System.out.println("Words: "+words);
                System.out.println("Letters: "+letters);
                System.out.println("Lines: "+lines);
            }
        }
    }
}