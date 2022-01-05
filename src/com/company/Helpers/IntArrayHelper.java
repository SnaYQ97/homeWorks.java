package com.company.Helpers;

public class IntArrayHelper {
    public int[] addElement(int newValue, int[] oldArray) {
        int[] newArray = new int[oldArray.length+1]; //create new arr with one more cell them old one

        //copy old arr to new
        System.arraycopy(oldArray, 0, newArray, 0, oldArray.length);
        newArray[oldArray.length] = newValue; //put new value to last cell in new array

        return newArray;
    }
}
