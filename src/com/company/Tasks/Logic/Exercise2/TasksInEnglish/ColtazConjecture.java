package com.company.Tasks.Logic.Exercise2.TasksInEnglish;

import com.company.Helpers.InputValidate;

public class ColtazConjecture {
    int step = 0;
    public void task() {
        System.out.println("Coltaz Codnjecture");
        coltazConjecture(getInput());
    }
    public int getInput(){
        return new InputValidate().isInt("Input value: ", null, true, false, null, false, null, false, false);
    }
    public void coltazConjecture(int n) {
        step++;
        if (n == 1){
            return;
        }else if (n%2==0) {
            System.out.println(step + ": " +  n/2);
            coltazConjecture(n/2);
        }else {
            System.out.println(step + ": " + (3*n+1));
            coltazConjecture(3*n+1);
        }
    }
}
