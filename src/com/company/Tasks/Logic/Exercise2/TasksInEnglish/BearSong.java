package com.company.Tasks.Logic.Exercise2.TasksInEnglish;

public class BearSong {
    String[] songWords = {" on the wall", " of beer", ".\nTake one down and pass it around, ", " bottle", "o more bottles of beer"};
    public void task() {
        System.out.println("Bear song");
        for (int bearAmount = 99; bearAmount>=0; bearAmount--) {
            System.out.println(getLirics(bearAmount)+"\n");
        }
    }
    public String getLirics(int bearAmount) {
        if (bearAmount > 2) {
            return bearAmount+songWords[3]+"s"+songWords[1]+songWords[0]+", "+bearAmount+songWords[3]+"s"+songWords[1]+songWords[2]+(bearAmount-1)+songWords[3]+"s"+songWords[1]+songWords[0]+".";
        }else if(bearAmount>1) {
            return bearAmount+songWords[3]+"s"+songWords[1]+songWords[0]+", "+bearAmount+songWords[3]+"s"+songWords[1]+songWords[2]+(bearAmount-1)+songWords[3]+songWords[1]+songWords[0]+".";
        }else if (bearAmount>0) {
            return bearAmount+songWords[3]+songWords[1]+songWords[0]+", "+bearAmount+songWords[3]+songWords[1]+".\nTake it down and pass it around, "+"n"+songWords[4]+songWords[0]+".";
        }else {
            return "N"+songWords[4]+songWords[0]+", "+ "n"+songWords[4]+".\n"+"Go to the store and buy some more, 99 bottles of beer on the wall.";
        }
    }
}
//for test copy put and compare that with example in exercise on webpage