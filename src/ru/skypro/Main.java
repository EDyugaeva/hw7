package ru.skypro;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        task1();
        task4();
    }


        public static void task1() {
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);
        String fullNameToReport = fullName.toUpperCase(Locale.ROOT);
        System.out.println("ФИО сотрудника для отчета " + fullNameToReport);
        String fullNameToAdminDirection = fullName.replace(" ", "; ");
        System.out.println("Данные ФИО сотрудника для административного отдела - " + fullNameToAdminDirection);

    }

    public static void task4() {
        String fullName = "Иванов Семён Семёнович";
        if (fullName.contains("ё")) {
            fullName = fullName.replace("ё", "е");
        }
        System.out.println("Данные ФИО сотрудника - " + fullName);

    }

}
