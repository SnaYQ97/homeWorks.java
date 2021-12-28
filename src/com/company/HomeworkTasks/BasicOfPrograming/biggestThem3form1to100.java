package com.company.HomeworkTasks.BasicOfPrograming;

public class biggestThem3form1to100 {
    public void task() {
        int counter = 0;
        for (int i=1; i<=100; i++) {
            if (i > 3 ) {
                counter++;
            }
        }
        System.out.println("Its "+counter+ " numbers biggest them 3 in the range from 1 to 100");
    }
}
