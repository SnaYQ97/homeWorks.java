package com.company;

//tasks
import com.company.HomeworkTasks.circleArea;
import com.company.HomeworkTasks.helloArtur;
import com.company.HomeworkTasks.biggestOne;
import com.company.HomeworkTasks.sphereCalc;
import com.company.HomeworkTasks.lottoGame;
//import helper
import com.company.HomeworkTasks.Helpers.InputValidate;


import java.io.IOException;

public class Main {


    public static void main(String[] args) throws IOException {
        int choice;
        String[] projectsList = {
                "1 - CircleArea",
                "2 - HelloArtur",
                "3 - BiggestOne",
                "4 - SphereCalculator",
                "5 - RandomSixNumbersLosTime",
        };
        System.out.println("Projects list:");
        for (String project : projectsList) {
            System.out.println( project);
        }

        int[] Limit = {1, 5}; //bring to top
        choice = new InputValidate().isInt("Choice project by number: ", null, true, true, Limit, false, null);

        switch (choice) {
            case 1:
                new circleArea().task();
                break;
            case 2:
                new helloArtur().task();
                break;
            case 3:
                new biggestOne().task();
                break;
            case 4:
                new sphereCalc().task();
                break;
            case 5:
                new lottoGame().task();
                break;
            default:
                System.out.println("Projects list: ");
                for (String project : projectsList) {
                    System.out.println( project);
                }
        }
    }
}
