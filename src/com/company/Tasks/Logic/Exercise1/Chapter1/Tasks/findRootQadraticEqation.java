package com.company.Tasks.Logic.Exercise1.Chapter1.Tasks;

import com.company.Helpers.InputValidate;

public class findRootQadraticEqation {
    public void task() {
        System.out.println("Check is linear equation");
        System.out.println("Expected: ax^2+bx+c=0");
        int a = new InputValidate().isInt("Input a: ", null, false, false, null, false, null, false, false);
        int b = new InputValidate().isInt("Input b: ", null, false, false, null, false, null, false, false);
        int c = new InputValidate().isInt("Input b: ", null, false, false, null, false, null, false, false);

        if (a==0) {
           new checkLinearEquation().useCheckLinearEquation(b, c);
        }else {

            double delta = ((b*b)-4*a*c);

            if (delta > 0) {
                double x1 = ((-b-Math.sqrt(delta))/(2*a));
                double x2 = ((-b+Math.sqrt(delta))/(2*a));
                System.out.println("Dwa rozwiązania: ");
                System.out.println(x1);
                System.out.println(x2);
            }else if(delta == 0) {
                double x12 = ((-b)/(2*a));
                System.out.println("Jedno rozwiązanie: ");
                System.out.println(x12);
            }else {
                System.out.println("Brak rozwiązań.");
            }
        }
    }
}
