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
                        System.out.println("Invalid input, limited length (maxLength("+lengthLimits[1]+")) of string expected");
                    }
                }else  {
                    System.out.println(error_message);
                }
            } else {
                if (sc.hasNext("[A-Za-z_\\p{IsLatin}]*")) {
                    input = sc.next();
                    isValid = true;
                }else  {
                    System.out.println(error_message);
                }
            }
        }while(!isValid);
        return input;
    }

    public int isInt (String message, String error_message, boolean positive, boolean limit, int[] between, boolean unique, int[] uniqueList) { //, boolean isPositive
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
            } else if(sc.hasNextInt()) {
                input = sc.nextInt();
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
}