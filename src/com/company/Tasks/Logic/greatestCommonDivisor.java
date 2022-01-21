package com.company.Tasks.Logic;

import com.company.Helpers.InputValidate;

public class greatestCommonDivisor {
    public void task() {
        int a, b;
        //InputValidate is my own class to validate inputs in my console applications for collage.
        //InputValidation have a isInt method, where program ask user for input and checking is valid  or not.
        //I also can set limit input ratio, unique or positive values for expected input.
        a = new InputValidate().isInt("Input first number: ", null, false, false, null, false, null);
        b = new InputValidate().isInt("Input first second: ", null, false, false, null, false, null);

        while (a !=b) {
            if (a>b) {
                a-=b;
            }else{
                b-=a;
            }
        }
        System.out.println(getGreatestCommonDivisor(a, b));
    }
    public int getGreatestCommonDivisor(int a, int b) {
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }
}
