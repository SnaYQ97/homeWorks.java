package com.company.Tasks.BasicOfPrograming;
import com.company.Helpers.InputValidate;
import com.company.Helpers.IntArrayHelper;
import com.company.Tasks.ProgramingParadigms.lottoGame;

import java.util.Arrays;

public class findMaxInArray {
    public void task() {

    }



    public double getRandomIntBetween(int min, int max) {
        return (double) (Math.random() * (max - min) + min);
    }
    public double[] getRandomDoubleArray(int arraySize) {
        double[] newArray = new double[arraySize];
        for (int i = 0; i < arraySize; i++) {
            newArray[i] = getRandomIntBetween(1, 50);
        }
        return newArray;
    }
}
