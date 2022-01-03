package com.company.Tasks.BasicOfPrograming;

public class printTableOfNumbers {
    public void task() {
        int x = 0;
        for (int i = 0; i <= 10; i++) {
            System.out.println("");
            for (int j = 0; j <= 10 ; j++) {
                if (i > 0) {
                    if ((i + j) < 10) {
                        System.out.print(" "+(j+i)+" ");
                    }else {
                        System.out.print(j+i+" ");
                    }
                }else {
                    if (j < 10) {
                        if (j == 0) {
                            System.out.print("   ");
                        }else {
                            System.out.print(" " + j + " ");
                        }
                    }else {
                        System.out.print(j + " ");
                    }
                }
            }
        }
    }
}
//expected
//0 1 2 3 4 5 6 7 8 9 10
//1 2 3 4 5 6 7 8 9 10 11
