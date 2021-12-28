package com.company.HomeworkTasks.ProgramingParadigms;

import com.company.HomeworkTasks.Helpers.InputValidate;

public class sphereCalc {
    public void task() {
        //define type of variables
        final double pi = Math.PI;
        int radius;
        //inset Radius value
        radius =  new InputValidate().isInt("Input radius:  ", null, true, false, null, false, null);

        //Calc sphere
        var sphereSurface = 4*pi*(radius*radius);
        //Output data with text
        System.out.println("For radius: " + radius);
        System.out.println("The sphere is equal to: " + sphereSurface);

        //Calc volume of sphere
        var sphereVolume = (4.0/3.0)*pi*(radius*radius*radius);
        //Output data with text
        System.out.println("The volume of sphere equal to: " + sphereVolume);
    }

}
