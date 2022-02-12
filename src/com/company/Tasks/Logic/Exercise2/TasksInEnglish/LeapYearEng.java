package com.company.Tasks.Logic.Exercise2.TasksInEnglish;

import com.company.Helpers.InputValidate;

public class LeapYearEng {
    public void task() {
        System.out.println("Check Year is Leap year");
        int year = new InputValidate().isInt("Input year: ", null, true, false, null, false,  null, false, false);
        String result = isLeapYear(year) ? "is" : "isn't";
        System.out.println("This year " + result + " leap year.");
    }
    public boolean isLeapYear(int year) {
        return year%4==0 && !(year%100==0) || year%400==0;
    }
}
