package com.company.Tasks.BasicOfPrograming;

public class printMultiplicationTable {
    public void task() {
        int i, j;
        for (i = 0; i <= 10; i++) {
            System.out.println();
            for (j = 0; j <= 10; j++) {
                if (i > 0) {
                    if ((i * j) < 10) {
                        if (j == 0) {
                            System.out.print("  "+i+""); //oś y
                        }else {
                            System.out.print("   " + (j * i) + "");//numbers lover them 10
                        }
                    }else if ((i*j) < 100 && (i*j) > 9) {
                        if (i == 10) {
                            System.out.print(" "+j * i + " ");
                        }else {
                            System.out.print("  " + j * i + "");
                        }
                    } else {
                        System.out.print(" "+j * i + ""); //100
                    }
                } else {
                    if (j < 10) {
                        if (j == 0) {
                            System.out.print("   ");
                        } else {
                            System.out.print("   " + j + ""); //oś x (1-9)
                        }
                    } else {
                        System.out.print("  "+ j + ""); //last numb oś x (10)
                    }
                }
            }
        }
    }
}