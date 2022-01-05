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
                "8 - String length (task 7.2)",
                "9 - Words counter (task 7.3)",
                "10 - Substring counter (task 7.4)",
                "11 - Password Checker (task 7.5)",
                "12 - Calculator (task 7.6)",

                "\n0 - Back\n",

        };
        System.out.println("BASIC OF PROGRAMING MENU");
        PrintMenuList.printList("Tasks list: ", tasksList);

        int[] Limit = {0, tasksList.length -1}; //bring to top
        choice = new InputValidate().isInt("Choice task by number: ", null, false, true, Limit, false, null);

        switch (choice) {
            case 0 -> Main.SubjectsMenu();
            case 1 -> new fibonacciSequence().task();
            case 2 -> new biggestThem3form1to100().task();
            case 3 -> new averageSquares().task();
            case 4 -> new evenNumbersCounter().task();
            case 5 -> new bitCharCounter().task();
            case 6 -> new printTableOfNumbers().task();
            case 7 -> new printMultiplicationTable().task();
            case 8 -> new stringLength().task();
            case 9 -> new wordsCounter().task();
            case 10 -> new substringCounter().task();
            case 11 -> new passwordChecker().task();
            case 12 -> new calculator().task();



            default -> PrintMenuList.printList("Tasks list: ", tasksList);
        }
    }
}
