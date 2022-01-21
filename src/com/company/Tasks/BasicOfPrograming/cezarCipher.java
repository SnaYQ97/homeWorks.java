package com.company.Tasks.BasicOfPrograming;

//helpers
import com.company.Helpers.InputValidate;
import com.company.Helpers.PrintMenuList;
//libs
import java.util.Scanner;

public class cezarCipher {
    char[] letters = "AĄBCĆDEĘFGIJKLŁMNŃOÓPQRSŚTUVWXYZŹŻ".toCharArray();
    char[] numbers = "0123456789".toCharArray();
    public void task() {
        String[] choiceList = {
                "1 - Encrypt",
                "2 - Decrypt",
        };
        int[] Limit = {1, 2};
        int choice;
        System.out.println("Welcome in Cezar Cipher.");
        String message = getMessage();
        int shift = getCezarShift();

        System.out.println("Your current message: "+message);
        System.out.println("Shift: "+shift);
        PrintMenuList.printList("What do you want do with your message?", choiceList);
        choice = new InputValidate().isInt("Input choice number: ", null, false, true, Limit, false, null);

        switch (choice) {
            case 1 -> {
                System.out.println("encoding...");
                System.out.println(encrypt(message, shift));}
            case 2 -> {
                System.out.println("decoding...");
                System.out.println(decrypt(message, shift));
            }
            default -> task();
        }
    }
    public String getMessage() {
        StringBuilder message = new StringBuilder();
        System.out.println("Input message: ");
        Scanner input = new Scanner(System.in);
        if(input.hasNextLine()) {
            String sentenceLine = input.nextLine();
            Scanner line = new Scanner(sentenceLine);
            while (line.hasNext()) {
                message.append(line.next()).append(" ");
            }
        }
        return message.toString().replaceAll("\\s+$", "");
    }
    public int getCezarShift() {
        int[] Limit = {0, 9};
        return new InputValidate().isInt("Input shift: ", null, false, true, Limit, false, null);
    }
    //Handler data
    public String decrypt(String message, int cezarShift) {
        StringBuilder newMessage = new StringBuilder();
        String letter;
        for (char character : message.toCharArray()) {
            if (Character.isAlphabetic(character)) {
                character = Character.toUpperCase(character);
                newMessage.append(decodeCharOnMatrix(character, letters, cezarShift));
            }else if(Character.isDigit(character)) {
                newMessage.append(decodeCharOnMatrix(character, numbers, cezarShift));
            }else {
                letter = Character.toString(character);
                newMessage.append(letter);
            }
        }
        return newMessage.toString();
    }
    public String encrypt(String message, int cezarShift) {
        StringBuilder newMessage = new StringBuilder();
        String letter;
        for (char character : message.toCharArray()) {
            if (Character.isAlphabetic(character)) {
                character = Character.toUpperCase(character);
                newMessage.append(encodeCharOnMatrix(character, letters, cezarShift));
            }else if(Character.isDigit(character)) {
                newMessage.append(encodeCharOnMatrix(character, numbers, cezarShift));
            }else {
                letter = Character.toString(character);
                newMessage.append(letter);
            }
        }
        return newMessage.toString();
    }
    public char encodeCharOnMatrix(char character, char[] matrix, int shift) {
        char newChar = character;
        for (int i = 0; i < matrix.length; i++) {
            if (character == matrix[i]) {
                newChar = matrix[(i+shift)%matrix.length];
                break;
            }
        }
        return newChar;
    }
    public char decodeCharOnMatrix(char character, char[] matrix, int shift) {
        char newChar = character;
        for (int i = 0; i < matrix.length; i++) {
            if (character == matrix[i]) {
                int indexWithShift = i-shift;
                if (indexWithShift < 0) {
                    indexWithShift += matrix.length;
                }
                newChar = matrix[indexWithShift];
                break;
            }
        }
        return newChar;
    }
}
