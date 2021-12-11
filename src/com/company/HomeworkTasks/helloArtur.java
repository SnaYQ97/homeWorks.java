package com.company.HomeworkTasks;

import com.company.HomeworkTasks.Helpers.InputValidate;

import java.util.Scanner;

public class helloArtur {
    public void task() {
        String name;
        name =  new InputValidate().isString("Input your Name: ", null);
        System.out.println("Hello <name> !");
        System.out.println("Hello " + name + " !");
    }
}
