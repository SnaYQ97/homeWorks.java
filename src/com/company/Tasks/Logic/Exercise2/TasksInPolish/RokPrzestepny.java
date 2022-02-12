package com.company.Tasks.Logic.Exercise2.TasksInPolish;

import com.company.Helpers.InputValidate;

public class RokPrzestepny {
    public void task() {
        System.out.println("Sprawdź czy rok jest przestępny.");
        int year = new InputValidate().isInt("Wprowadź rok: ", "Nieprawidłowa wartość", true, false, null, false,  null, false, false);
        String result = isLeapYear(year) ? " jest" : " nie jest";
        System.out.println("Rok " + year + result + " rokiem przestępnym.");
    }
    public boolean isLeapYear(int year) {
        return year%4==0 && !(year%100==0) || year%400==0;
    }
}
