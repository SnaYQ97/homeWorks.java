package com.company.Tasks.ProgramingParadigms;

import java.util.Arrays;

import com.company.Helpers.InputValidate;
import com.company.Helpers.IntArrayHelper;

public class lottoGame {
    public void task() {
        int firstNumber, nextNumber;
        int[] Limit = {1, 49}, lottoTicket = new int[0];
        int dayCounter = 0;

        firstNumber = new InputValidate().isInt("Input first number (0:49): ", null, true, true, Limit, false, null, false, false);
        lottoTicket = new IntArrayHelper().addElement(firstNumber, lottoTicket);

        while (lottoTicket.length < 6) {//take 6 unique numbers from user
            nextNumber = new InputValidate().isInt("Input unique number (0:49): ", null, true, true, Limit, true, lottoTicket, false, false);
            lottoTicket = new IntArrayHelper().addElement(nextNumber, lottoTicket);
        }
        Arrays.sort(lottoTicket);

        System.out.println(Arrays.toString(lottoTicket));
        System.out.println(Arrays.toString(getLotto()));


        while (!(Arrays.equals(getLotto(), lottoTicket))) {
            dayCounter++;
        }


        System.out.println(dayCounter);
        System.out.println("You will won on after " + dayCounter/365 + " years, and " + dayCounter%365 + " days. Good luck! Try again!");
    }

    public int getRandomIntBetween(int min, int max) {
        return (int) (Math.random() * (max - min) + min);
    }

    public int[] getLotto() {
        int[] lotto = new int[0];
        int lottoNumber;

        while ((lotto.length <= 5)) {
            lottoNumber = getRandomIntBetween(1, 50);
            if (lotto.length == 0) {
                lotto = new IntArrayHelper().addElement(lottoNumber, lotto);
            } else {
                if (new InputValidate().isUnique(lottoNumber, lotto)) {
                    lotto = new IntArrayHelper().addElement(lottoNumber, lotto);
                }
            }
        }
        Arrays.sort(lotto);
        return lotto;
    }
}
