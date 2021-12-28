//TO-DO
//TODO: add back or exit menu in end of each task.

package com.company;
//Menu Items
import com.company.MainMenuItems.AboutAuthor;
import com.company.MainMenuItems.ProgramingParadigms;
import com.company.MainMenuItems.BasicOfPrograming;
//Helpers
import com.company.HomeworkTasks.Helpers.InputValidate;
import com.company.HomeworkTasks.Helpers.PrintMenuList;
//Libs
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        SubjectsMenu();
    }

    public static void SubjectsMenu() throws IOException {
        int choice;
        String subjectsListTitle = "Subjects list: ";
        String[] subjectsList = {
                "1 - Programing Paradigms",
                "2 - Basic of Programing",
                //next Subject,
                "\n3 - About me",
                "0 - Exit\n"
        };

        PrintMenuList.printList(subjectsListTitle, subjectsList);

        int[] Limit = {0, subjectsList.length-1}; //bring to top
        choice = new InputValidate().isInt("Chose a subject's tasks: ", null, false, true, Limit, false, null);

        switch (choice) {
            case 0 -> System.exit(0);
            case 1 -> new ProgramingParadigms().menu();
            case 2 -> new BasicOfPrograming().menu();
            case 3 -> new AboutAuthor().menu();

            default -> PrintMenuList.printList(subjectsListTitle, subjectsList);
        }
    }
}
