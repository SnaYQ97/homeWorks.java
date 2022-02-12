package com.company.Tasks.Logic.Exercise2.TasksInPolish;

import com.company.Helpers.InputValidate;

public class ProstaSuma {
    public void task() {
        System.out.println("Prosta Suma");
        System.out.println(new InputValidate().isDouble("Podaj pierwszą liczbę: ", "Nieprawidłowe dane.") + new InputValidate().isDouble("Podaj drugą liczbę: ", "Nieprawidłowe dane."));
    }
}
