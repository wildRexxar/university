package controller;

import service.StudentInfoService;
import java.util.Scanner;

class JSON_CREATE {
    private static Scanner scanner = new Scanner(System.in);

    public static void start() {

        StudentInfoService studentInfoService = new StudentInfoService();
        System.out.print("JSON:\n1 - JSON студента\n2 - JSON группы\n" +
                "3 - Меню Университета\n4 - Выход\n");

        int x = scanner.nextInt();
        switch (x) {
            case 1:
                studentInfoService.demoStudent();
                ControllerForUniversity.separator();
                start();
            case 2:
                studentInfoService.demoGroup();
                ControllerForUniversity.separator();
                start();
            case 3:
                ControllerForUniversity.start();
            case 4:
                System.exit(0);
            default:
                ControllerForUniversity.separator();
                start();
        }
    }
}
