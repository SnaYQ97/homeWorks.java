package com.company.Tasks.Logic.Exercise1.Chapter1;

import com.company.Helpers.InputValidate;
import com.company.Helpers.PrintMenuList;
import com.company.Tasks.Logic.Exercise1.Chapter1.Tasks.checkLinearEquation;
import com.company.Tasks.Logic.Exercise1.Chapter1.Tasks.findRootQadraticEqation;
import com.company.Tasks.Logic.Exercise1.Chapter1.Tasks.greatestCommonDivisor;
import com.company.Tasks.Logic.Exercise1.Chapter1.Tasks.leastCommonMultiple;
import com.company.Tasks.Logic.Exercise1.ChaptersMenu;

import java.io.IOException;

public class ChapterMenu {
    public void menu() throws IOException {
        int choice;
        String listTitle = "Tasks list: ";
        String[] tasksList = {
                //Chapter 1
                "1 - Linear Equation",
                "2 - QuadraticEquation",
                "3 - GreatestCommonDivision",
                "4 - LeastCommonMultiple",

                //new Task
                "\n0 - Back to Chapters menu\n",

        };
        System.out.println("CHAPTER1 MENU");
        PrintMenuList.printList(listTitle, tasksList);

        int[] Limit = {0, tasksList.length - 1}; //bring to top
        choice = new InputValidate().isInt("Choice task by number: ", null, false, true, Limit, false, null, false, false);

        switch (choice) {
            case 0 -> new ChaptersMenu().menu();
            case 1 -> new greatestCommonDivisor().task();
            case 2 -> new leastCommonMultiple().task();
            case 3 -> new checkLinearEquation().task();
            case 4 -> new findRootQadraticEqation().task();

            default -> PrintMenuList.printList(listTitle, tasksList);
        }
    }
}
