package com.company.MainMenuItems;
//Helpers
import com.company.HomeworkTasks.Helpers.InputValidate;
import com.company.HomeworkTasks.Helpers.PrintMenuList;
//Tasks
import com.company.HomeworkTasks.BasicOfPrograming.*;
//Main
import com.company.Main;

import java.io.IOException;

public class BasicOfPrograming {
    public static void menu() throws IOException {
        int choice;
        String[] tasksList = {
                "1 - Fibonacci sequence",
                "2 - Biggest them 3 in range (1->100)",
                "3 - Average of Squares (1->10)",
                "4 - Even and Odd Numbers counter",
                "5 - Bit in char counter",
                //New task
                "\n0 - Back\n",

        };

        PrintMenuList.printList("Tasks list: ", tasksList);

        int[] Limit = {0, tasksList.length -1}; //bring to top
        choice = new InputValidate().isInt("Choice project by number: ", null, false, true, Limit, false, null);

        switch (choice) {
            case 0 -> Main.SubjectsMenu();
            case 1 -> new fibonacciSequence().task();
            case 2 -> new biggestThem3form1to100().task();
            case 3 -> new averageSquares().task();
            case 4 -> new evenNumbersCounter().task();
            case 5 -> new bitCharCounter().task();

            default -> PrintMenuList.printList("Tasks list: ", tasksList);
        }
    }
}
