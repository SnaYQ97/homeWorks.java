package com.company.Tasks.BasicOfPrograming;

import java.util.Arrays;
import java.util.Scanner;

//helper
import com.company.Helpers.StringArrayHelper;

public class calculator {
    public void task() {
        //Original: num {dzialanie} num = num ->  = num is unnecessary
        //My propose: num {dzialanie} num -> program return value.

        String[] actionList = {"plus", "minus", "times", "divide"}, wordsArray =  {};
        double a, b;
        String word;

        System.out.println("Expected input example: number {plus}/{minus}/{times}/{divide} number");
        System.out.println("For enter press Ctrl+D or Ctrl+C.");
        System.out.println("Input operation: ");
        //input string like: num {plus}/{minus}/{times}/{divide} num
        Scanner input  = new Scanner(System.in);

        if (input.hasNextLine()) {
            while (input.hasNext()) {
                word = input.next();
                wordsArray = new StringArrayHelper().addNewElement(word, wordsArray);
            }
        }

        //validate input
        System.out.println(Arrays.toString(wordsArray));
        Scanner firstWord = new Scanner(wordsArray[0]);
        if(firstWord.hasNextDouble()) {
            a = firstWord.nextDouble();
        }else {
            System.out.println("Invalid input, expected number as first word in operation");
            return;
        }
        Scanner secondWord = new Scanner(wordsArray[1]);
        if(secondWord.hasNext()) {
            word = secondWord.next();
            boolean haveActionWord = false;
            for (String action: actionList ) {
                if (word.contains(action)) {
                    haveActionWord = true;
                    break;
                }
            }
            if (!haveActionWord) {
                System.out.println("Invalid input, expected action as second word in operation");
                return;
            }
        } else {
            System.out.println("Invalid input, expected action as second word in operation");
            return;
        }
        Scanner lastWord = new Scanner(wordsArray[2]);
        if(lastWord.hasNextDouble()) {
            b = lastWord.nextDouble();
        }else {
            System.out.println("Invalid input, expected number as third word in operation");
            return;
        }
        //all words are correct, and we have int a,b and action word
        //convert action word to math char.
        switch (word) {
            case "plus" -> System.out.println(a+b);
            case "minus" -> System.out.println(a-b);
            case "times" -> System.out.println(a*b);
            case "divide" -> {
                if (b > 0 ) {
                    System.out.println(a/b);
                }else System.out.println("Can't divide by 0");
            }

            default -> System.out.println("Not expected error");
            }
    }
}
