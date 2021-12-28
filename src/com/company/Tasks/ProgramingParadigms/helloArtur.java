package com.company.Tasks.ProgramingParadigms;

import com.company.Helpers.InputValidate;

public class helloArtur {
    public void task() {
        String name;
        name =  new InputValidate().isString("Input your Name: ", null, false, null);
        System.out.println("Hello <name> !");
        System.out.println("Hello " + name + " !");
    }
}
