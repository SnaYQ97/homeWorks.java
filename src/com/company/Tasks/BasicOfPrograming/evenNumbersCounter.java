package com.company.Tasks.BasicOfPrograming;

public class evenNumbersCounter {
    public void task() {
        int i;
        int evenCounter = 0;
        int oddCounter = 0;
        for (i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                evenCounter++;
            }else {
             oddCounter++;
            }
        }
        System.out.println("In range from 1 to 10 is " +evenCounter+ " even numbers and "+oddCounter+ " odd numbers");
    }
}
