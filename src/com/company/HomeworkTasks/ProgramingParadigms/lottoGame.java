package com.company.HomeworkTasks.ProgramingParadigms;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

import com.company.HomeworkTasks.Helpers.InputValidate;
import com.company.HomeworkTasks.Helpers.ArrayHelper;

public class lottoGame {
    public void task() {
        int firstNumber, nextNumber;
        int[] Limit = {1, 49}, lottoTicket = new int[0];
        int daysInYear, currentYear = java.time.Year.now().getValue(), years, days, dayCounter = 0;
        String yearText, dayText;
        long futerDate;
        long todayDate;

        firstNumber = new InputValidate().isInt("Input first number (0:49): ", null, true, true, Limit, false, null);
        lottoTicket = new ArrayHelper().addElement(firstNumber, lottoTicket);

        while (lottoTicket.length <= 5) {//take 6 unical numbers from user
            nextNumber = new InputValidate().isInt("Input unical number (0:49): ", null, true, true, Limit, true, lottoTicket);
            lottoTicket = new ArrayHelper().addElement(nextNumber, lottoTicket);
        }
        Arrays.sort(lottoTicket);

        System.out.println(Arrays.toString(lottoTicket));
        System.out.println(Arrays.toString(getLotto()));


        while (!(Arrays.equals(getLotto(), lottoTicket))) {
            dayCounter++;
        }

        System.out.println("You will won on " +dayCounter+ " try. Good luck! Try again!");
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
                lotto = new ArrayHelper().addElement(lottoNumber, lotto);
            } else {
                if (new InputValidate().isUnical(lottoNumber, lotto)) {
                    lotto = new ArrayHelper().addElement(lottoNumber, lotto);
                }
            }
        }
        Arrays.sort(lotto);
        return lotto;
    }
}
