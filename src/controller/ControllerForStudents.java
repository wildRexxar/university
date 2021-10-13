package controller;

import java.util.Scanner;
import service.*;

public class ControllerForStudents {
    private static StudentsManagement studentsManagement = new StudentsManagement();

    public static void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Студенты:\n1 - Создать студентов\n2 - Показать студента\n" +
                "3 - Показать всех студентов\n4 - Удалить студента\n5 - Удалить всех студентов\n" +
                "6 - Поставить оценку\n7 - Показать статистику\n8 - Добавть студентов в группу\n9 - Меню университета\n10 - Выход\n");

        int x = scanner.nextInt();
        switch (x) {
            case 1:
                studentsManagement.add();
                ControllerForUniversity.separator();
                start();
            case 2:
                studentsManagement.get();
                ControllerForUniversity.separator();
                start();
            case 3:
                studentsManagement.show();
                ControllerForUniversity.separator();
                start();
            case 4:
                studentsManagement.remove();
                ControllerForUniversity.separator();
                start();
            case 5:
                studentsManagement.clear();
                ControllerForUniversity.separator();
                start();
            case 6:
                studentsManagement.maksWrite();
                ControllerForUniversity.separator();
                start();
            case 7:
                studentsManagement.markShow();
                ControllerForUniversity.separator();
                start();
            case 8:
                studentsManagement.addToGroup();
                ControllerForUniversity.separator();
                start();
            case 9:
                ControllerForUniversity.start();
            case 10:
                System.exit(0);
            default:
                ControllerForUniversity.separator();
                start();
        }
    }
}
