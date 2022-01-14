package com.company.Tasks.BasicOfPrograming;

//helpers
import com.company.Helpers.PrintMenuList;
import com.company.Helpers.InputValidate;
//libs
import java.util.Arrays;
import java.util.Scanner;

public class cezarCipher {
    char[] letters = "AĄBCĆDEĘFGHIJKLŁMNŃOÓPRSŚTUWYZŹŻ".toCharArray();
    char[] numbers = "0123456789".toCharArray();

    public void task() {
        String[] menu = {
                "1 - Decrypt",
                "2 - Encrypt",
        };
        int[] Limit = {1, 2};
        int choice;

        //Input: Hello word
        // move -> 1
        //Output: Ifmmp xpse

        //matryca liter (A-Z_a-z) -> array of characters
        //matryce liczb (0-9) -> array of characters

        // text to char
        // char + 1
        // moved char.

        //print menu
        // 1 - encode message zakodować
        // 2 - decode message odkodować

        //=========
        //1
        //get message to code
        //get vector move
        // code
        //return coded message

        //======
        //2
        //get coded message
        //get knowing move vector
        // decode
        //return decoded message.

        System.out.println("Welcome in Cezar Cipher.");

        new PrintMenuList().printList("What do you want do with your message?", menu);
        choice = new InputValidate().isInt("Input choice number: ", null, false, true, Limit, false, null);

        String message = getMessage();
        System.out.println(message);
        int shift = getCezarShift(); //not working correct
        System.out.println(shift);

//        switch (choice) {
//            case 1 -> System.out.println(encrypt(message, shift));
//            case 2 -> System.out.println(decrypt(message, shift));
//
//            default -> task();
//        }
    }

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
            if (!input.hasNextLine()) {
                break;
            }
        }
        return message.replaceAll("\\s+$", "");
    }
    //not working correct
    public int getCezarShift() {
        int shift = new InputValidate().isInt("Input shift: ", null, false, false, null, false, null);
        return shift;
    }

    public String decrypt(String message, int cezarShift) {
        return "";
    }

    public String encrypt(String message, int cezarShift) {
//        StringBuilder result = new StringBuilder();
//        for (char character : message.toCharArray()) {
//            if (character != ' ') {
//                int originalAlphabetPosition = character - 'a';
//                int newAlphabetPosition = (originalAlphabetPosition + offset) % 26;
//                char newCharacter = (char) ('a' + newAlphabetPosition);
//                result.append(newCharacter);
//            } else {
//                result.append(character);
//            }
//        }
//        return result;
        return "";
    }
}