package com.company.Tasks.BasicOfPrograming;
//helpers
import com.company.Helpers.IntArrayHelper;

import java.util.Arrays;

public class arrayManipulation {
    public void task() {
        int[] firstArray = {1 , 2 , 3, 4, 5, 6, 7, 8, 9, 10};
        int[] otherArray = {11 , 12 , 13, 14, 15, 16, 17, 18, 19, 20};

        System.out.println("Arrays before addition");
        System.out.println("Array first: "+ Arrays.toString(firstArray));
        System.out.println("Array other: "+ Arrays.toString(otherArray));
        System.out.println("Arrays after addition: "+ Arrays.toString(additionItemsOfArray(firstArray, otherArray)));
        System.out.println();
        System.out.println("Arrays before multiplication");
        System.out.println("Array first: "+ Arrays.toString(firstArray));
        System.out.println("Array other: "+ Arrays.toString(otherArray));
        System.out.println("Arrays after multiplication: "+ Arrays.toString(multiplicationItemsOfArray(firstArray, otherArray)));
    }
    public int[] additionItemsOfArray(int[] firstArray, int[] secondArray) {
        // [] + []
        int i;
        int result;
        int[] resultOfAddition = {};  
        
        for (i = 0; i < firstArray.length; i++) {
            result = firstArray[i] + secondArray[i];
            resultOfAddition = new IntArrayHelper().addElement(result, resultOfAddition);
        }
        return resultOfAddition;
    }
    public int[] multiplicationItemsOfArray(int[] firstArray, int[] secondArray) {
        // [] * []
        int i;
        int result;
        int[] resultOfMultiplication = {};

        for (i = 0; i < firstArray.length; i++) {
            result = firstArray[i] * secondArray[i];
            resultOfMultiplication = new IntArrayHelper().addElement(result, resultOfMultiplication);
        }
        return resultOfMultiplication;
    }
}
