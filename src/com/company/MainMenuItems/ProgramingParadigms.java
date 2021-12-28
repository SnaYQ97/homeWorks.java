package com.company.MainMenuItems;
//Helpers
import com.company.HomeworkTasks.Helpers.InputValidate;
import com.company.HomeworkTasks.Helpers.PrintMenuList;
//Tasks
import com.company.HomeworkTasks.ProgramingParadigms.*;
//Main
import com.company.Main;

import java.io.IOException;

public class ProgramingParadigms {
    public static void menu() throws IOException {
        int choice;
        String listTitle = "Tasks list: ";
        String[] tasksList = {

                "1 - CircleArea",
                "2 - HelloArtur",
                "3 - BiggestOne",
                "4 - SphereCalculator",
                "5 - lottoGame",
                //new Task
                "\n0 - Back\n",

        };
        PrintMenuList.printList(listTitle, tasksList);

        int[] Limit = {0, tasksList.length - 1}; //bring to top
        choice = new InputValidate().isInt("Choice project by number: ", null, false, true, Limit, false, null);

        switch (choice) {
            case 0 -> Main.SubjectsMenu();
            case 1 -> new circleArea().task();
            case 2 -> new helloArtur().task();
            case 3 -> new biggestOne().task();
            case 4 -> new sphereCalc().task();
            case 5 -> new lottoGame().task();


            default -> PrintMenuList.printList(listTitle, tasksList);
        }
    }
}
