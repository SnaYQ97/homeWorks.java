package com.company.HomeworkTasks.Helpers;

public class PrintMenuList {
     public static void printList(String listTitle, String[] list) {
        System.out.println(listTitle);
        for (String listItem : list) {
            System.out.println(listItem);
        }
    }
}
