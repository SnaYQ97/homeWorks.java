package com.company.MainMenuItems;
//Helpers
import com.company.Helpers.InputValidate;
import com.company.Helpers.PrintMenuList;
//Tasks
import com.company.Tasks.BasicOfPrograming.*;
//Main
import com.company.Main;

import java.io.IOException;

public class BasicOfPrograming {
    public void menu() throws IOException {
        int choice;
        String[] tasksList = {
                "1 - Fibonacci sequence (task 5.1)",
                "2 - Biggest them 3 in range (1->100) (task 5.2)",
                "3 - Average of Squares (1->10) (task 5.3)",
                "4 - Even and Odd Numbers counter (task 5.4)",
                "5 - Bit in char counter (task 5.5)",
                "6 - Print table of numbers (task 5.9)",
                "7 - Print multiplication table (task 5.10)",
                "8 - Cezar cipher (task 5.11)",
                "9 - Find max in array (task 6.1)",
                //"10 - Find min in array (task 6.2)",
                "10 - String length (task 7.2)",
                "11 - Words counter (task 7.3)",
                "12 - Substring counter (task 7.4)",
                "13 - Password Checker (task 7.5)",
                "14 - Calculator (task 7.6)",
                "15 - String arrays sorting (task 7.7)",
                "16 - Addition and multiplication int arrays (task 8.3)",

                "\n0 - Back\n",

        };
        System.out.println("BASIC OF PROGRAMING MENU");
        PrintMenuList.printList("Tasks list: ", tasksList);

        int[] Limit = {0, tasksList.length -1}; //bring to top
        choice = new InputValidate().isInt("Choice task by number: ", null, false, true, Limit, false, null, false, false);

        switch (choice) {
            case 0 -> Main.SubjectsMenu();
            case 1 -> new fibonacciSequence().task();
            case 2 -> new biggestThem3form1to100().task();
            case 3 -> new averageSquares().task();
            case 4 -> new evenNumbersCounter().task();
            case 5 -> new bitCharCounter().task();
            case 6 -> new printTableOfNumbers().task();
            case 7 -> new printMultiplicationTable().task();
            case 8 -> new cezarCipher().task();
            case 9 -> new findMaxInArray().task();
            //case 10 -> new findMinInArray().task();
            case 10 -> new stringLength().task();
            case 11 -> new wordsCounter().task();
            case 12 -> new substringCounter().task();
            case 13 -> new passwordChecker().task();
            case 14 -> new calculator().task();
            case 15 -> new sortStringArrays().task();
            case 16 -> new arrayManipulation().task();

            default -> PrintMenuList.printList("Tasks list: ", tasksList);
        }
    }
}
