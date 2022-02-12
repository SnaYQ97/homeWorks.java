package com.company.Tasks.Logic.Exercise2.TasksInEnglish;

import com.company.Helpers.InputValidate;
import com.company.Helpers.PrintMenuList;
import com.company.MainMenuItems.Logic;
import com.company.Tasks.Logic.Exercise2.Exercise2;

import java.io.IOException;

public class TasksInEnglishMenu {
    public void menu() throws IOException {
        int choice;
        String listTitle = "Tasks in English menu: ";
        String[] tasksList = {
                "1 - Reverse first letter and last letter in string",
                "2 - Check Year is Leap Year",
                "3 - Triangle",
                "4 - Space Age Calculator",
                "5 - Coltaz Conjecture",
                "6 - Atbasz Chipher",
                "7 - Beer Song",
                //new Task
                "\n0 - Back to Exercise2 menu\n",

        };
        System.out.println("You choice Tasks is English menu.");
        System.out.println("");
        PrintMenuList.printList(listTitle, tasksList);

        int[] Limit = {0, tasksList.length - 1};
        choice = new InputValidate().isInt("Choice Task by number: ", null, false, true, Limit, false, null, false, false);

        switch (choice) {
            case 0 -> new Exercise2().menu();
            case 1 -> new ReverseLettersInString().task();
            case 2 -> new LeapYearEng().task();
            case 3 -> new TriangleType().task();
            case 4 -> new SpaceAgeCalculator().task();
            case 5 -> new ColtazConjecture().task();
            case 6 -> new AtbaszChipher().task();
            case 7 -> new BearSong().task();
            default -> PrintMenuList.printList(listTitle, tasksList);
        }
    }
}
