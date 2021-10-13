package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entity.*;
import repository.*;

public class GroupsManagement implements Group_Interface {
    private int index;

    @Override
    public void add() {
        Group group = createGroup();
        if (group != null) {
            Base.getBaseOfGroup().add(group);
            System.out.println("Группа добавлена");
        } else {
            System.out.println("не удалось добавить группу");
        }
    }

    @Override
    public void remove() {
        if (findGroup() != null) {
            Base.getBaseOfGroup().remove(index);
            System.out.println("Удаление прошло успешно");
        } else {
            System.out.println("Группа не найдена");
        }
    }

    @Override
    public void get() {
        if (findGroup() != null) {
            System.out.println(Base.getBaseOfGroup().get(index));
            Group group = Base.getBaseOfGroup().get(index);
            List<Student> list = group.getListOfStudents();
            System.out.println(list.size());
            for (Student in : list) {
                System.out.println(in);
            }
        } else {
            System.out.println("Группа не найдена");
        }
    }

    @Override
    public void clear() {
        Base.getBaseOfGroup().clear();
        System.out.println("Все группы удалены");
    }

    @Override
    public void show() {
        Base.getBaseOfGroup().forEach(System.out::println);
    }


    @Override
    public Group createGroup() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Создание группы : ");
        List<Student> group = new ArrayList<>();

        System.out.println("Введи название группы : ");
        String groupName = scanner.next();
        Group gr1 = new Group(groupName, group);
        System.out.println("Группа создана ");
        return gr1;
    }

    @Override
    public Group findGroup() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи номер группы");
        String number = scanner.next();
        Group gr = new Group(number);
        if (Base.getBaseOfGroup().contains(gr)) {
            index = Base.getBaseOfGroup().indexOf(gr);
            Group group = Base.getBaseOfGroup().get(index);
            return group;
        } else {
            return null;
        }
    }
}
