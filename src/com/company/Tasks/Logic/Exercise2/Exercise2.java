package com.company.Tasks.Logic.Exercise2;
//helpers
import com.company.Helpers.InputValidate;
import com.company.Helpers.PrintMenuList;
//menus
import com.company.Tasks.Logic.Exercise2.TasksInEnglish.TasksInEnglishMenu;
import com.company.MainMenuItems.Logic;
import com.company.Tasks.Logic.Exercise2.TasksInPolish.TasksInPolishMenu;

import java.io.IOException;

public class Exercise2 {
    public void menu() throws IOException {
        int choice;
        String listTitle = "Exercises menu: ";
        String[] tasksList = {
                //Chapter 1
                "1 - Tasks in English from WebSite",
                "2 - Tasks in Polish from PDF",
                //new Task
                "\n0 - Back to Exercises menu\n",

        };
        System.out.println("You choice Exercise2.");
        System.out.println("");
        PrintMenuList.printList(listTitle, tasksList);

        int[] Limit = {0, tasksList.length - 1}; //bring to top
        choice = new InputValidate().isInt("Choice Exercise by number: ", null, false, true, Limit, false, null, false, false);

        switch (choice) {
            case 0 -> new Logic().menu();
            case 1 -> new TasksInEnglishMenu().menu();
            case 2 -> new TasksInPolishMenu().menu();

            default -> PrintMenuList.printList(listTitle, tasksList);
        }
    }
}
