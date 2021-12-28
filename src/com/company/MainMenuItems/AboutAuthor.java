package com.company.MainMenuItems;
//Helpers
import com.company.HomeworkTasks.Helpers.InputValidate;
import com.company.HomeworkTasks.Helpers.PrintMenuList;
//Main
import com.company.Main;

import java.io.IOException;
import java.net.URL;

import static com.company.HomeworkTasks.Helpers.PrintMenuList.printList;

public class AboutAuthor {
    public static void menu() throws IOException {
        int choice;
        URL GitHubLink = new URL("https://github.com/artowir97");
        URL LinkedInLink = new URL("https://www.linkedin.com/in/artur-domurad-a57b81197/");

        String[] tasksList = {
                "1 - GitHub",
                "2 - LinkedIn",
                //New task
                "\n0 - Back\n",

        };
        System.out.println("My name is Artur Domurad,");
        System.out.println("I'm a Software Developer in Hemmersbach Co.");
        printList("Tasks list: ", tasksList);

        int[] Limit = {0, tasksList.length -1}; //bring to top
        choice = new InputValidate().isInt("Choice project by number: ", null, false, true, Limit, false, null);

        switch (choice) {
            case 0 -> Main.SubjectsMenu();
            case 1 -> System.out.println(GitHubLink);
            case 2 -> System.out.println(LinkedInLink);

            default -> printList("Tasks list: ", tasksList);
        }
    }
}
