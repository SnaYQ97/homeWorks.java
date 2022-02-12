package com.company.Tasks.Logic.Exercise1.Chapter1.Tasks;

import com.company.Helpers.InputValidate;

public class checkLinearEquation {
    public void task() {
        System.out.println("Check is linear equation");
        System.out.println("Expected: ax+b=0");
        double a = new InputValidate().isDouble("Input a: ", null);
        double b = new InputValidate().isDouble("Input b: ", null);

        useCheckLinearEquation(a,b);
    }

    public void useCheckLinearEquation(double a, double b) {
        if (a==0 && b==0) {
            System.out.println("Nieskonczenie wiele rozwiazan");
        } else if (a==0 && b!=0) {
            System.out.println("Brak rozwiazan");
        }else {
            System.out.println("x for 0 = "+ -b/a);
        }
    }
}



