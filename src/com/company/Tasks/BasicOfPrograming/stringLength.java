package com.company.Tasks.BasicOfPrograming;

import com.company.Helpers.InputValidate;

public class stringLength {
    public void task() {
        String input;

        input = new InputValidate().isString("Input text to length count: ", null, false, null);
        //use own function
        System.out.println("length: " + getLength(input));
    }
    //declare own function
    public int getLength(String input) {;
        int counter = 0;
        for (char c : input.toCharArray()) {
            counter++;
        }
        return counter;
    }
}
