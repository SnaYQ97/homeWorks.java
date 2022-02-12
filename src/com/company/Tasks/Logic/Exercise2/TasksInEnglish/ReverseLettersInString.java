package com.company.Tasks.Logic.Exercise2.TasksInEnglish;

import java.util.Scanner;

public class ReverseLettersInString {
    public void task() {
        System.out.println("First and last String letter reverser");
        System.out.println(reverseLetters(getString()));
    }
    public String getString() {
        StringBuilder sentence = new StringBuilder();
        System.out.println("Input: ");
        Scanner input = new Scanner(System.in);
        if(input.hasNextLine()) {
            String sentenceLine = input.nextLine();
            Scanner line = new Scanner(sentenceLine);
            while (line.hasNext()) {
                sentence.append(line.next()).append(" ");
            }
        }
        return sentence.toString().replaceAll("\\s+$", "");
    }
    public String reverseLetters(String sentence) {
        return sentence.toCharArray()[sentence.length()-1]+sentence.substring(1, sentence.length()-1)+sentence.toCharArray()[0];
    }
}
