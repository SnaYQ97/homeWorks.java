package com.company.Tasks.Logic.Exercise2.TasksInEnglish;

import com.company.Helpers.InputValidate;
import com.company.Helpers.PrintMenuList;

import java.util.Scanner;

public class AtbaszChipher {
    char[] letters = "AĄBCĆDEĘFGIJKLŁMNŃOÓPQRSŚTUVWXYZŹŻ".toCharArray();
    char[] numbers = "0123456789".toCharArray();
//    FOR TESTS
//    char[] lettersReverse = "ŻŹZYXWVUTŚSRQPÓOŃNMŁLKJIGFĘEDĆCBĄA".toCharArray();
//    char[] numbers = "9876543210".toCharArray();

    public void task() {
//        FOR TESTS
//        for (int i = 0; i < letters.length; i++) {
//            System.out.println(letters[i] + " - " + lettersReverse[i]);
//        }
        String[] choiceList = {
                "1 - Encrypt",
                "2 - Decrypt",
        };
        int[] Limit = {1, 2};
        int choice;
        System.out.println("Welcome in Atbasz Cipher.");
        String message = getMessage();

        System.out.println("Your current message: " + message);
        PrintMenuList.printList("What do you want do with your message?", choiceList);
        choice = new InputValidate().isInt("Input choice number: ", null, false, true, Limit, false, null, false, false);

        switch (choice) {
            case 1 -> {
                System.out.println("encoding...");
                System.out.println(encrypt(message));
            }
            case 2 -> {
                System.out.println("decoding...");
                System.out.println(decrypt(message));
            }
            default -> task();
        }
    }

    public String getMessage() {
        StringBuilder message = new StringBuilder();
        System.out.println("Input message: ");
        Scanner input = new Scanner(System.in);
        if (input.hasNextLine()) {
            String sentenceLine = input.nextLine();
            Scanner line = new Scanner(sentenceLine);
            while (line.hasNext()) {
                message.append(line.next()).append(" ");
            }
        }
        return message.toString().replaceAll("\\s+$", "");
    }

    public int g() {
        int[] Limit = {0, 9};
        return new InputValidate().isInt("Input shift: ", null, false, true, Limit, false, null, false, false);
    }

    //Handler data
    public String decrypt(String message) {

        StringBuilder newMessage = new StringBuilder();
        String letter;
        for (char character : message.toCharArray()) {
            if (Character.isAlphabetic(character)) {
                character = Character.toUpperCase(character);
                newMessage.append(decodeCharOnMatrix(character, letters));
            } else if (Character.isDigit(character)) {
                newMessage.append(decodeCharOnMatrix(character, numbers));
            } else {
                letter = Character.toString(character);
                newMessage.append(letter);
            }
        }
        return newMessage.toString();
    }

    public String encrypt(String message) {
        StringBuilder newMessage = new StringBuilder();
        String letter;
        for (char character : message.toCharArray()) {
            if (Character.isAlphabetic(character)) {
                character = Character.toUpperCase(character);
                newMessage.append(encodeCharOnMatrix(character, letters));
            } else if (Character.isDigit(character)) {
                newMessage.append(encodeCharOnMatrix(character, numbers));
            } else {
                letter = Character.toString(character);
                newMessage.append(letter);
            }
        }
        return newMessage.toString();
    }

    public char encodeCharOnMatrix(char character, char[] matrix) {
        char newChar = character;
        for (int i = 0; i < matrix.length; i++) {
            if (character == matrix[i]) {
                newChar = matrix[(matrix.length-1)-i];
                break;
            }
        }
        return newChar;
    }

    public char decodeCharOnMatrix(char character, char[] matrix) {
        char newChar = character;
        for (int i = 0; i < matrix.length; i++) {
            if (character == matrix[i]) {
                newChar = matrix[(matrix.length-1)-i];
                break;
            }
        }
        return newChar;
    }
}
