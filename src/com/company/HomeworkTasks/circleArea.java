package com.company.HomeworkTasks;

import java.io.IOException;

import com.company.HomeworkTasks.Helpers.InputValidate;

public class circleArea {
    public void task() throws IOException {
        //define type of variables
        final double pi = Math.PI;
        int radius;
        //inset Radius value
        int[] Limit = {0, 103621}; //10362 is max calculated radius for java int
        radius =  new InputValidate().isInt("Input your circle radius:  ", null, true, true, Limit, false, null);

        //Calc Circle area
        var CircleArea = pi*(radius*radius);
        //Output data with text
        System.out.println("For radius: " + radius);
        System.out.println("The area of circle is equal to: " + CircleArea);
    }
}
