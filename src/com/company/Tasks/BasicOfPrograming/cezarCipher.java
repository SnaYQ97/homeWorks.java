package com.company.Tasks.BasicOfPrograming;

//helpers
import com.company.Helpers.PrintMenuList;
import com.company.Helpers.InputValidate;
//libs
import java.util.Scanner;

public class cezarCipher {
    char[] letters = "AĄBCĆDEĘFGHIJKLŁMNŃOÓPQRSŚTUVWXYZŹŻ".toCharArray();
    char[] numbers = "0123456789".toCharArray();

    public void task() {
        String[] menu = {
                "1 - Decrypt",
                "2 - Encrypt",
        };
        int[] Limit = {1, 2};
        int choice;

        System.out.println("Welcome in Cezar Cipher.");
        String message = getMessage();
        System.out.println(message);//test
        int shift = getCezarShift();
        System.out.println(shift);//test

//        new PrintMenuList().printList("What do you want do with your message?", menu);
//        choice = new InputValidate().isInt("Input choice number: ", null, false, true, Limit, false, null);
//
//        switch (choice) {
//            case 1 -> System.out.println(encrypt(message, shift));
//            case 2 -> System.out.println(decrypt(message, shift));
//            default -> task();
//        }
        System.out.println(encrypt(message, shift));

    }
    //Get Data
    public String getMessage() {
        String message = "";
        System.out.println("Input message: ");
        Scanner input = new Scanner(System.in);
        while (input.hasNextLine()) {
            String sentenceLine = input.nextLine();
            Scanner line = new Scanner(sentenceLine);
            while (line.hasNext()) {
                message += line.next() + " ";
                //System.out.println(); //{debug}
            }
            break;
        }
        return message.replaceAll("\\s+$", "");
    }
    public int getCezarShift() {
        int[] Limit = {0, 9};
        int shift = new InputValidate().isInt("Input shift: ", null, false, true, Limit, false, null);
        return shift;
    }
    //Handler data
    public String decrypt(String message, int cezarShift) {
        return "";
    }

    public String encrypt(String message, int cezarShift) {
        System.out.println("encrypting...");
        String newMessage = "";
        String letter;
        for (char character : message.toCharArray()) {
            if (Character.isAlphabetic(character)) {
                if (Character.isLowerCase(character)) {
                    character = Character.toUpperCase(character);
                }
                //move on letters matrix
                for (int i = 0; i < letters.length; i++) {
                    System.out.println("Looking for index...");
                    if (character == letters[i]) {
                        int indexOfCharacter = i;//[0] A
                        int maxMatrixIndex = letters.length-1; //32-1 [31]

                        int newLetterIndex = indexOfCharacter + cezarShift; //0 - 1 = -1
                        if (newLetterIndex > maxMatrixIndex) { //32 > 31
                            newLetterIndex = newLetterIndex - letters.length; //x = 32 - 31 = 1 [1] -> b expected [0]
                        }else if(newLetterIndex < 0) {
                            newLetterIndex = letters.length - maxMatrixIndex;
                        }
                        char encrytChar = letters[newLetterIndex];
                        letter = Character.toString(encrytChar);
                        newMessage+=letter;
                    }
                }

            }else {
                letter = Character.toString(character);
                newMessage += letter;
            }
//            if (Character.isDigit(character)) {
//                //move on numbers matrix
//            }
        }
        return newMessage;
    }
}