package com.company.HomeworkTasks.BasicOfPrograming;

import com.company.HomeworkTasks.Helpers.InputValidate;

public class bitCharCounter {
    public void task() {
        String input;
        char stringToChar;
        int i, oneCounter = 0,charToInt;
        String intToBinaryString;

        System.out.println("");
        input = new InputValidate().isString("Input char to count: ", null, true, new int[]{1,1});

        //conversion
        stringToChar = input.charAt(0);
        //conversion
        charToInt = (int) stringToChar;
        //conversion
        intToBinaryString = Integer.toBinaryString(charToInt);

        for (i = 0; i < intToBinaryString.length(); i++) {
            if ((intToBinaryString.toCharArray()[i] == '1')) {
                oneCounter++;
            }
        }
        System.out.println("Char: "+input);
        System.out.println("Binary: "+intToBinaryString);
        System.out.println("Number of bits set to one: "+oneCounter);
    }
}

