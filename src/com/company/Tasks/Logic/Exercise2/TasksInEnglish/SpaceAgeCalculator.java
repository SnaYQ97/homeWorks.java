package com.company.Tasks.Logic.Exercise2.TasksInEnglish;

import com.company.Helpers.InputValidate;

public class SpaceAgeCalculator {
    public void task() {
//        Given an age in seconds, calculate how old someone would be on:
//
//        Mercury: orbital period 0.2408467 Earth years
//        Venus: orbital period 0.61519726 Earth years
//        Earth: orbital period 1.0 Earth years, 365.25 Earth days, or 31557600 seconds
//        Mars: orbital period 1.8808158 Earth years
//        Jupiter: orbital period 11.862615 Earth years
//        Saturn: orbital period 29.447498 Earth years
//        Uranus: orbital period 84.016846 Earth years
//        Neptune: orbital period 164.79132 Earth years
//        So if you were told someone were 1,000,000,000 seconds old, you should be able to say that they're 31.69 Earth-years old.
        String[] planets = {
                "Mercury",
                "Venus",
                "Earth",
                "Mars",
                "Jupiter",
                "Saturn",
                "Uranus",
                "Neptune"
        };
        double[] periods = {
                0.2408467,
                0.61519726,
                1.0,
                1.8808158,
                11.862615,
                29.447498,
                84.016846,
                164.79132
        };
        System.out.println("Space Age Calculator");
        int userAge = getAge();
        for (int i = 0; i < planets.length; i++) {
            System.out.println("You are " + userAge/periods[i] +" years old on " + planets[i]);
        }
    }
    public int getAge() {
        return new InputValidate().isInt("Input your age in years: ", null, true, false, null, false, null, false, false);
    }
}

//check correction https://www.exploratorium.edu/ronh/age/
