package com.company.Tasks.ProgramingParadigms;

import com.company.Helpers.InputValidate;

public class biggestOne {
    public void task() {
        //int first, second, third;
        int firstNumber, secondNumber, lastNumber;
        System.out.println("Input 3 numbers.");
        System.out.println("I will return the biggest one.");
            firstNumber = new InputValidate().isInt("Input first value: ", null, false, false, null, false, null, false, false);
            secondNumber = new InputValidate().isInt("Input second value: ", null, false, false, null, false,null, false, false);
            lastNumber = new InputValidate().isInt("Input third value: ", null, false, false, null, false,null, false, false);
        System.out.println("The biggest One: "+ Math.max(Math.max(firstNumber, secondNumber), lastNumber));
    }
}
