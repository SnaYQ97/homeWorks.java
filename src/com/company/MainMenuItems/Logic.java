package com.company.MainMenuItems;
//Helpers
import com.company.Helpers.InputValidate;
import com.company.Helpers.PrintMenuList;
//Tasks
import com.company.Tasks.Logic.checkLinearEquation;
import com.company.Tasks.Logic.greatestCommonDivisor;
import com.company.Tasks.Logic.leastCommonMultiple;
import com.company.Tasks.ProgramingParadigms.*;
//Main
import com.company.Main;

import java.io.IOException;

public class Logic {
    public void menu() throws IOException {
        int choice;
        String listTitle = "Tasks list: ";
        String[] tasksList = {
                //choice - task_section
                "1 - Task 1_1",
                "2 - Task 1_2", // not added
                //new Task
                "\n0 - Back\n",

        };
        System.out.println("LOGIC MENU");
        PrintMenuList.printList(listTitle, tasksList);

        int[] Limit = {0, tasksList.length - 1}; //bring to top
        choice = new InputValidate().isInt("Choice task by number: ", null, false, true, Limit, false, null);

        switch (choice) {
            case 0 -> Main.SubjectsMenu();
            case 1 -> new greatestCommonDivisor().task();
            case 2 -> new leastCommonMultiple().task();
            case 3-> new checkLinearEquation();

            default -> PrintMenuList.printList(listTitle, tasksList);
        }
    }
}
