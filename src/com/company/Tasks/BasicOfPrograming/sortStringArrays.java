package com.company.Tasks.BasicOfPrograming;

import java.util.Arrays;

public class sortStringArrays {

    public void task() {
        String[] names = {"Tomek","Jarek","Zbyszek","Agata"};
        System.out.println("Array before sorting: "+Arrays.toString(names));
        bubbleSortTable(names);
    }
    public void bubbleSortTable(String[] arrayToSort) {
        String item;
        System.out.println("Array after sorting:");
        for (int j = 0; j < arrayToSort.length; j++) {
            for (int i = j + 1; i < arrayToSort.length; i++) {
                // comparing adjacent strings
                if (arrayToSort[i].compareTo(arrayToSort[j]) < 0) {
                    item = arrayToSort[j];
                    arrayToSort[j] = arrayToSort[i];
                    arrayToSort[i] = item;
                }
            }
            System.out.println(arrayToSort[j]);
        }
    }
}
