package com.company.HomeworkTasks.BasicOfPrograming;

public class evenNumbersCounter {
    public void task() {
        int i = 0;
        int evenCouner = 0;
        int oddCounter = 0;
        for (i = i; i <= 10; i++) {
            if (i % 2 == 0) {
                evenCouner++;
            }else {
             oddCounter++;
            }
        }
        System.out.println("In range from 1 to 10 is " +evenCouner+ " even numbers and "+oddCounter+ " odd numbers");
    }
}
