package com.company.Tasks.Logic.Exercise1;

import com.company.Helpers.InputValidate;
import com.company.Helpers.PrintMenuList;
import com.company.MainMenuItems.Logic;
import com.company.Tasks.Logic.Exercise1.Chapter1.Tasks.greatestCommonDivisor;

import java.io.IOException;

public class ChaptersMenu {
    public void menu() throws IOException {
        int choice;
        String listTitle = "Chapters list: ";
        String[] tasksList = {
                //Chapter 1
                "1 - Chapter1",
                "2 - Chapter2",

                //new Task
                "\n0 - Back to Exercises Menu\n",
        };

        System.out.println("Exercise 1");
        System.out.println("Chapters menu");
        PrintMenuList.printList(listTitle, tasksList);

        int[] Limit = {0, tasksList.length - 1}; //bring to top
        choice = new InputValidate().isInt("Choice chapter by number: ", null, false, true, Limit, false, null, false, false);

        switch (choice) {
            case 0 -> new Logic().menu();
            case 1 -> new greatestCommonDivisor().task();
            case 2 -> {
                System.out.println("Chapter 2 is read-only file in GitHub repository");
                new ChaptersMenu().menu();
            }
            default -> PrintMenuList.printList(listTitle, tasksList);
        }
    }
}
