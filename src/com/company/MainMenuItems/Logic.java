package com.company.MainMenuItems;
//Helpers
import com.company.Helpers.InputValidate;
import com.company.Helpers.PrintMenuList;
//Main
import com.company.Main;
//Menus
import com.company.Tasks.Logic.Exercise2.Exercise2;
import com.company.Tasks.Logic.Exercise1.ChaptersMenu;

import java.io.IOException;

public class Logic {
    public void menu() throws IOException {
        int choice;
        String listTitle = "Exercises menu: ";
        String[] tasksList = {
                //Chapter 1
                "1 - Exercise1",
                "2 - Exercise2",
                //new Task
                "\n0 - Back to Subjects Menu\n",
        };
        System.out.println("You choice Logic subject.");
        System.out.println("");
        PrintMenuList.printList(listTitle, tasksList);

        int[] Limit = {0, tasksList.length - 1}; //bring to top
        choice = new InputValidate().isInt("Choice Exercise by number: ", null, false, true, Limit, false, null, false, false);

        switch (choice) {
            case 0 -> Main.SubjectsMenu();
            case 1 -> new ChaptersMenu().menu();
            case 2 -> new Exercise2().menu();
            default -> PrintMenuList.printList(listTitle, tasksList);
        }
    }
}
