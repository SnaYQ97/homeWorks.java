package com.company.Helpers;

public class ArrayHelper {
    public int[] addElement(int newValue, int[] oldArray) {
        int[] newArray = new int[oldArray.length+1]; //create new arr with one more cell them old one

        for(int x = 0; x < oldArray.length; x++) {
            newArray[x] = oldArray[x]; //copy old arr to new
        }
        newArray[oldArray.length] = newValue; //put new value to last cell in new array

        return newArray;
    }

}
