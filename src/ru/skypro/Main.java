package ru.skypro;

public class Main {

    public static void main(String[] args) {
//        task1();
//        task4();
//        task5();
        task6();
        System.out.println(" ");
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
        for (int i = 0; i < rightName.length; i++) {
            char s = rightName[i];
            if (Character.isLowerCase(s) && (i == 0 || rightName[i - 1] == 32 )) {
                rightName[i] = Character.toUpperCase(rightName[i]);
            }
        }
        fullName = new String(rightName);
        System.out.print("Верное написание ФИО сотрудника" + fullName);
//        String fullName1 = Arrays.toString(rightName);
//        System.out.println("Верное написание ФИО сотрудника " + fullName1);

        String[] words = fullName.split(" ");
        for (int i = 0; i < words.length; i++) {
            char[] chars = words[i].toCharArray();
            if (Character.isLowerCase(chars[0])) {
                chars[0] = Character.toUpperCase(chars[0]);
                words[i] = new String(chars);
            }
            System.out.println(String.join(" ", words));

        }


    }

    public static void task7() {
        String s1 = "135";
        String s2 = "246";
        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars1.length; i ++) {
            sb.append(chars1[i]);
            sb.append(chars2[i]);
        }
        String result = sb.toString();
        System.out.println(result);


    }

    public static void task8() {
        String task = "aabccddefgghiijjkk";
        char[] massiveTask = task.toCharArray();
        for (int i = 0; i < massiveTask.length - 1; i++) {
            if (massiveTask[i] == massiveTask[i + 1]) {
                System.out.print(massiveTask[i]);
            }

        }

    }

}
