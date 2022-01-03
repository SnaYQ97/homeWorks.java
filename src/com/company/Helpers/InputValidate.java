package com.company.Helpers;
//Scanner
import java.util.Scanner;
//TO-DO
//TODO: change varibles name to cammelcase
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
                if (sc.hasNext("[A-Za-z]*")) {
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
                if (sc.hasNext("[A-Za-z]*")) {
                    input = sc.next();
                    isValid = true;
                }else  {
                    System.out.println(error_message);
                }
            }
        }while(!isValid);
        return input;
    }

    public int isInt (String message, String error_message, boolean Positive, boolean Limit, int[] Between, boolean Unical, int[] unicalList) { //, boolean isPositive
        boolean isValid = false;
        if (error_message == null) error_message = "Invalid input, number expected";
        //find between java function

        int input = 0;

        //big validate
        do {
            System.out.print(message);
            Scanner sc = new Scanner(System.in); //imput value and start validate
            if (sc.hasNextInt() && Positive && Limit && Unical) {
                input = sc.nextInt();
                if (input > 0) {
                    if (input >= Between[0] && input <= Between[1]) {
                        if (isUnical(input, unicalList)){
                            isValid = true;
                        }else {
                            System.out.print("Invalid input, unical value different them (");
                            for(int listItem : unicalList ) {System.out.print(listItem+" ");}
                            System.out.println(") expected.");
                        }
                    }else System.out.println("Invalid input, positive number between "+Between[0]+" and "+Between[1]+" expected");
                }else {
                    System.out.println("Invalid input, positive number expected");
                }
            }else if (sc.hasNextInt() && Positive && Limit) {
                input = sc.nextInt();
                if (input > 0) {
                    if (input >= Between[0] && input <= Between[1]) {
                        isValid = true;
                    }else System.out.println("Invalid input, positive number between "+Between[0]+" and "+Between[1]+" expected");
                }else {
                    System.out.println("Invalid input, positive number expected");
                }
            }else if (sc.hasNextInt() && Limit)  {
                input = sc.nextInt();
                if (input >= Between[0] && input <= Between[1]) {
                    isValid = true;
                }else {
                    System.out.println("Invalid input, number between "+Between[0]+" and "+Between[1]+" expected");
                }
            }else if (sc.hasNextInt() && Positive) {
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

    public boolean isUnical (int currentValue,int[] valueList ) {
        int x;
        boolean isUnical = false;

        for (int item :  valueList) {
            if (currentValue == item) {
                isUnical = false;
                return  isUnical;
            }else {
                isUnical = true;
            }
        }

        return isUnical;
    }
}