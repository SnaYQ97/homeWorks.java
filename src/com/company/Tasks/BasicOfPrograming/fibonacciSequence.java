package com.company.Tasks.BasicOfPrograming;

import com.company.Helpers.InputValidate;

public class fibonacciSequence {
    public void task() {
        int steps;

        System.out.println("Fibonacci sequence.");
        System.out.println();

        steps = new InputValidate().isInt("Input steps count: ", null, true, false, null, false, null, false, false);

        sequence(steps);

    }

    public void sequence(int maxStep) {
        int step;
        for (step = 1; step <= maxStep; step++) {
            System.out.println("Step " + step + ": " + fib(step-1));
        }
    }

    public long fib  (long N) {
        if (N==0) {
            return 0;
        }
        else if (N == 1) {
            return 1;
        }
        else {
            return fib(N-1) + fib(N-2);
        }
    }
}
