package com.company.Tasks.BasicOfPrograming;
//helpers
import com.company.Helpers.InputValidate;

public class passwordChecker {
    public void task() {
        //I should use even salt but its dummy example, in normal I will use Argon2 or some like that
        String secretPassword = "secret"; //is looking password from PDF example
        int[] limitLength = {6, 20}; //max 20 like in PDF example
        int trails = 3;

        while (trails > 0) {
            String userInput = new InputValidate().isString("Input secret password: ", null, true, limitLength);
            if (secretPassword.equals(userInput)) {
                //success
                System.out.println("Password is correct.");
                System.out.println("Welcome!");
                return;
            }else {
                //wrong
                System.out.println("Invalid password. Try again."); //wrong password
                trails--;
                System.out.println(trails + " trail/s left"); // - 1 trails left
            }
        }
    }
}
