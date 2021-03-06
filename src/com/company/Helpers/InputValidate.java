package com.company.Helpers;
//Scanner
import java.util.Scanner;
//TO-DO
//TODO: Add isChar Validation
//TODO: Add extended Patterns to isString func and refactor this.
public class InputValidate {
    public String isString(String message, String error_message, boolean limitedLength, int[] lengthLimits) {
        if (error_message == null) error_message = "Invalid input";
        boolean isValid = false;
        String input = null;

        do {
            System.out.print(message);
            Scanner sc = new Scanner(System.in);
            if (limitedLength) {
                if (sc.hasNext("[A-Za-z_\\p{IsLatin}]*")) {
                    input = sc.next();
                    if (input.length() >= lengthLimits[0] && input.length() <= lengthLimits[1]) {
                        isValid = true;
                    }else {
                        System.out.println("Invalid input, "+"min: "+lengthLimits[0]+" max: "+lengthLimits[1]+" length of string expected.");
                    }
                }else  {
                    System.out.println(error_message);
                }
            } else {
                if (sc.hasNext("[A-Za-z_\\p{IsLatin}]*")) { //\p{IsAlphabetic} //mather ("")
                    input = sc.next();
                    isValid = true;
                }else  {
                    System.out.println(error_message);
                }
            }
        }while(!isValid);
        return input;
    }

    public int isInt (String message, String error_message, boolean positive, boolean limit, int[] between, boolean unique, int[] uniqueList, boolean even, boolean odd) { //, boolean isPositive
        boolean isValid = false;
        if (error_message == null) error_message = "Invalid input, number expected";
        //find between java function

        int input = 0;

        //big validate
        do {
            System.out.print(message);
            Scanner sc = new Scanner(System.in); //input value and start validate
            if (sc.hasNextInt() && positive && limit && unique) {
                input = sc.nextInt();
                if (input > 0) {
                    if (input >= between[0] && input <= between[1]) {
                        if (isUnique(input, uniqueList)){
                            isValid = true;
                        }else {
                            System.out.print("Invalid input, unique value different them (");
                            for(int listItem : uniqueList ) {System.out.print(listItem+" ");}
                            System.out.println(") expected.");
                        }
                    }else System.out.println("Invalid input, positive number between "+between[0]+" and "+between[1]+" expected");
                }else {
                    System.out.println("Invalid input, positive number expected");
                }
            }else if (sc.hasNextInt() && positive && limit) {
                input = sc.nextInt();
                if (input > 0) {
                    if (input >= between[0] && input <= between[1]) {
                        isValid = true;
                    }else System.out.println("Invalid input, positive number between "+between[0]+" and "+between[1]+" expected");
                }else {
                    System.out.println("Invalid input, positive number expected");
                }
            }else if (sc.hasNextInt() && limit)  {
                input = sc.nextInt();
                if (input >= between[0] && input <= between[1]) {
                    isValid = true;
                }else {
                    System.out.println("Invalid input, number between "+between[0]+" and "+between[1]+" expected");
                }
            }else if (sc.hasNextInt() && positive) {
                input = sc.nextInt();
                if (input > 0) {
                    isValid = true;
                }
                else System.out.println("Invalid input, positive number expected");
            }else if (sc.hasNextInt() && even) {
                input = sc.nextInt();
                if (isEven(input)) {
                    isValid = true;
                }
                else System.out.println("Invalid input, even number expected");
            }else if (sc.hasNextInt() && odd) {
                input = sc.nextInt();
                if (!isEven(input)) {
                    isValid = true;
                }
                else System.out.println("Invalid input, odd number expected");
            }
            else if(sc.hasNextInt()) {
                input = sc.nextInt();
                isValid = true;
            } else {
                System.out.println(error_message);
            }
        }while(!isValid);

        return input;
    }

    public double isDouble (String message, String error_message) {
        error_message = error_message == null ?  "Invalid input, number expected" : error_message;
        boolean isValid = false;
        double input = 0.0;
        do {
            System.out.print(message);
            Scanner sc = new Scanner(System.in); //input value and start validate
            if (sc.hasNextDouble()) {
                input = sc.nextDouble();
                isValid = true;
            } else {
                System.out.println(error_message);
            }
        }while(!isValid);

        return input;
    }

    public boolean isUnique (int currentValue,int[] valueList ) {
        boolean isUnique = false;

        for (int item :  valueList) {
            if (currentValue == item) {
                return  false;
            }else {
                isUnique = true;
            }
        }
        return isUnique;
    }

    public boolean isEven(int input) {
        return input%2==0;
    }
}