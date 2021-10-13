package service;

import java.util.*;

import entity.*;
import repository.*;

public class StudentsManagement implements Student_Interface {
    private Scanner scanner = new Scanner(System.in);
    private GroupsManagement groupsManagement = new GroupsManagement();
    private int index;
    private static OptionalDouble avr;

    @Override
    public void add() {
        for (int i = 0; i < 8; i++) {
            if (Base.getBaseOfStudent().size() < 8) {
                Base.getBaseOfStudent().add(new Student(i, "x" + i, "y" + i));
                System.out.println("Добавление прошло успешно");
            } else {
                System.out.println("Группа заполнена");
            }
        }
        System.out.println(Base.getBaseOfStudent().size());
    }

    @Override
    public void remove() {
        if (challenger() != null) {
            Base.getBaseOfStudent().remove(index);
            System.out.println("Удаление прошло успешно");
        } else {
            System.out.println("Студент не найден");
        }
    }

    @Override
    public void get() {
        if (challenger() != null) {
            System.out.println("Студент: ");
            System.out.println(Base.getBaseOfStudent().get(index));
        } else {
            System.out.println("Студент не найден");
        }
    }

    @Override
    public void clear() {
        Base.getBaseOfStudent().clear();
        System.out.println("Все студенты удалены");
    }

    @Override
    public void show() {
        Base.getBaseOfStudent().forEach(System.out::println);
    }


    public void addToGroup() {
        Group group = groupsManagement.findGroup();
        if (group != null) {
            group.setListOfStudents(Base.getBaseOfStudent());
        } else {
            System.out.println("Группа не найдена");
        }
    }

    @Override
    public void maksWrite() {
        challenger();
        Student student = Base.getBaseOfStudent().get(index);
        if (student != null) {
            for (int i = 0; i < 15; i++) {
                student.getMarks().add((int) (Math.random() * 11));
            }
            avr = student.getMarks().stream().mapToInt(x -> x).average();
            System.out.println("Оценки сгенерированы");
        } else {
            System.out.println("Студент не найден");
        }
    }

    @Override
    public void markShow() {
        challenger();
        Student student = Base.getBaseOfStudent().get(index);
        System.out.println("Студент : " + student);
        System.out.println("Оценки : ");
        student.getMarks().forEach(x -> System.out.print(x + " "));
        System.out.println("\nСредний бал :");
        if (avr.isPresent()) {
            System.out.println(avr.getAsDouble());
        }
    }

    @Override
    public Student challenger() {
        System.out.println("Введи id студента");
        int id = scanner.nextInt();
        System.out.println("Введи имя студента");
        String firstName = scanner.next();
        System.out.println("Введи фамилию студента");
        String lastNameName = scanner.next();
        if (Base.getBaseOfStudent().contains(new Student(id, firstName, lastNameName))) {
            index = Base.getBaseOfStudent().indexOf(new Student(id, firstName, lastNameName));
            return new Student(id, firstName, lastNameName);
        } else {
            return null;
        }
    }
}