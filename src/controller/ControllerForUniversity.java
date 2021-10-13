package controller;

import java.util.Scanner;

public class ControllerForUniversity {

    public static void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Университет :\n1 - Группы\n2 - Студенты\n" +
                "3 - Создание JSON\n" + "4 - Выход\n");

        int x = scanner.nextInt();
        switch (x) {
            case 1:
                ControllerForGroups.start();
                separator();
                start();
            case 2:
                ControllerForStudents.start();
                separator();
                start();
            case 3:
                JSON_CREATE.start();
                separator();
                start();
            case 4:
                System.exit(0);
            default:
                separator();
                start();
        }
    }

    protected static void separator() {
        System.out.println("*********************************");
    }
}
