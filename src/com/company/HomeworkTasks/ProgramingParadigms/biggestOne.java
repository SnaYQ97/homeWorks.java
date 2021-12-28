package com.company.HomeworkTasks.ProgramingParadigms;

import com.company.HomeworkTasks.Helpers.InputValidate;

public class biggestOne {
    public void task() {
        //int first, second, third;
        int firstNumber, secondNumeber, lastNumber;
        System.out.println("Input 3 numbers.");
        System.out.println("I will return the biggest one.");
            firstNumber = new InputValidate().isInt("Input first value: ", null, false, false, null, false, null);
            secondNumeber = new InputValidate().isInt("Input second value: ", null, false, false, null, false,null);
            lastNumber = new InputValidate().isInt("Input third value: ", null, false, false, null, false,null);
        System.out.println("The biggest One: "+ Math.max(Math.max(firstNumber, secondNumeber), lastNumber));
    }
}
