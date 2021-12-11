package ru.skypro;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        task1();
//        task4();
//        task5();
//        task6();
        task7();
        task8();
    }


    public static void task1() {
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);


        String fullNameToReport = fullName.toUpperCase();
        System.out.println("ФИО сотрудника для отчета " + fullNameToReport);


        String fullNameToAdminDirection = fullName.replace(" ", "; ");
        System.out.println("Данные ФИО сотрудника для административного отдела - " + fullNameToAdminDirection);

    }

    public static void task4() {
        String fullName = "Иванов Семён Семёнович";
//        if (fullName.contains("ё")) {
        fullName = fullName.replace("ё", "e");
//        }
        System.out.println("Данные ФИО сотрудника - " + fullName);

    }

    public static void task5() {
        String name = "Ivanov Ivan Ivanovich";
        String[] words = name.split(" ");
//        String middleName = words[2];
//        String lastName = words[0];
//        String firstName = words[1];

        String lastName = name.substring(0, name.indexOf(" "));
        String firstName = name.substring(name.indexOf(" ") + 1, name.lastIndexOf(" "));
        String middleName = name.substring(name.lastIndexOf(" ") + 1);

        System.out.println("Имя сотрудника - " + firstName);
        System.out.println("Фамилия сотрудника - " + lastName);
        System.out.println("Отчество сотрудника - " + middleName);

    }

    public static void task6() {
        String fullName = "ivanov ivan ivanovich";
        char[] rightName = fullName.toCharArray();
        rightName[0]=Character.toUpperCase(rightName[0]);
        for (int i = 0; i < rightName.length; i++) {
            char s = rightName[i];
            if (s == 32) {
                rightName[i + 1] = Character.toUpperCase(rightName[i + 1]);
            }
            System.out.print(rightName[i]);
        }
//        String fullName1 = Arrays.toString(rightName);
//        System.out.println("Верное написание ФИО сотрудника " + fullName1);

    }
    public static void task7() {
        String first = "135";
        String second = "246";
        StringBuilder result = new StringBuilder("123456");

        for (int i = 0; i < 3; i=i+2) {
            result.setCharAt(i,first.charAt(i));
            result.setCharAt((i+1),second.charAt(i));
                    }
        System.out.println(result);


    }
    public static void task8() {
        String task = "aabccddefgghiijjkk";
        char[] massiveTask = task.toCharArray();
        for (int i = 0; i < massiveTask.length-1; i++) {
            if (massiveTask[i]==massiveTask[i+1]) {
                System.out.print(massiveTask[i]);
            }

        }

    }

}
