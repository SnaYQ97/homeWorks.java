package com.company.Helpers;

public class StringArrayHelper {
    public String[] addNewElement(String newValue, String[] oldArray) {
        String[] newArray = new String[oldArray.length+1]; //create new arr with one more cell them old one

        //copy old arr to new
        System.arraycopy(oldArray, 0, newArray, 0, oldArray.length);
        newArray[oldArray.length] = newValue; //put new value to last cell in new array

        return newArray;
    }
}
