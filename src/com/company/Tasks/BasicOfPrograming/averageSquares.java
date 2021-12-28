package com.company.Tasks.BasicOfPrograming;

public class averageSquares {
    public void task() {
        int sum = 0;
        int i;
        double b = 10.0;

        for(i = 0; i <= 10; i++){
            sum+=i*i;
        }

        System.out.println("Average of Square(1:10) is equal to: "+ sum / b);
    }
}
