package com.company.Tasks.Logic.Exercise2.TasksInPolish;

import com.company.Helpers.InputValidate;
import com.company.Helpers.PrintMenuList;
import com.company.Tasks.Logic.Exercise1.Chapter1.Tasks.findRootQadraticEqation;
import com.company.Tasks.Logic.Exercise2.Exercise2;

import java.io.IOException;

public class TasksInPolishMenu {
    public void menu() throws IOException {
        int choice;
        String listTitle = "Tasks in Polish menu: ";
        String[] tasksList = {
                //Tasks
                "1 - Rok przestępny",
                "2 - Prosta Suma",
                "3 - Miejsca zerowe równania kwadratowego",
                //PL MENU
                //new Task
                "\n0 - Back to Exercise2 menu\n",
        };
        System.out.println("You choice Tasks is Polish menu.");
        PrintMenuList.printList(listTitle, tasksList);

        int[] Limit = {0, tasksList.length - 1};
        choice = new InputValidate().isInt("Choice Task by number: ", null, false, true, Limit, false, null, false, false);

        switch (choice) {
            case 0 -> new Exercise2().menu();
            case 1 -> new RokPrzestepny().task();
            case 2 -> new ProstaSuma().task();
            case 3 -> new findRootQadraticEqation().task();

            default -> PrintMenuList.printList(listTitle, tasksList);
        }
    }
}
