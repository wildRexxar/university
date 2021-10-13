package controller;

import java.util.Scanner;
import service.*;

public class ControllerForGroups {
    private static GroupsManagement groupsManagement = new GroupsManagement();

    public static void start() {
     Scanner scanner = new Scanner(System.in);
        System.out.print("Группы:\n1 - Создать группу\n2 - Показать группу\n" +
                "3 - Показать все группы\n4 - Удалить группу\n5 - Удалить все группы\n" +
                "6 - Меню университета\n7 - Выход\n");

        int x = scanner.nextInt();
        switch (x) {
            case 1:
                groupsManagement.add();
                ControllerForUniversity.separator();
                start();
            case 2:
                groupsManagement.get();
                ControllerForUniversity.separator();
                start();
            case 3:
                groupsManagement.show();
                ControllerForUniversity.separator();
                start();
            case 4:
                groupsManagement.remove();
                ControllerForUniversity.separator();
                start();
            case 5:
                groupsManagement.clear();
                ControllerForUniversity.separator();
                start();
            case 6:
                ControllerForUniversity.start();
            case 7:
                System.exit(0);
            default:
                ControllerForUniversity.separator();
                start();
        }
    }
}
