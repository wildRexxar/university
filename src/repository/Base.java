package repository;

import java.util.ArrayList;
import java.util.List;

import entity.*;

public class Base {
    private static List<Group> baseOfGroup = new ArrayList<>();

    public static List<Group> getBaseOfGroup() {
        return baseOfGroup;
    }

    private static List<Student> baseOfStudent = new ArrayList<>();

    public static List<Student> getBaseOfStudent() {
        return baseOfStudent;
    }

}
