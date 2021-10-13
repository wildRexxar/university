package service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import entity.Group;
import entity.Student;

import java.util.Scanner;

public class StudentInfoService {
    Scanner scanner = new Scanner(System.in);

    private Group groupFind() {
        GroupsManagement groupsManagement = new GroupsManagement();
        Group group = groupsManagement.findGroup();
        return group;
    }

    public void demoGroup() {
        ObjectMapper objectMapper = new ObjectMapper();
        Group group = groupFind();
        try {
            String str = objectMapper.writeValueAsString(group);
            System.out.println(str);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

    private Student studentFind() {
        Group group = groupFind();
        System.out.println("Введи номер студента");
        int id = scanner.nextInt();
        System.out.println("Введи имя студента");
        String firstName = scanner.next();
        System.out.println("Введи фамилию студента");
        String lastName = scanner.next();
        Student student = new Student(id, firstName, lastName);
        int index = group.getListOfStudents().indexOf(student);
        Student student1 = group.getListOfStudents().get(index);
        return student1;
    }

    public void demoStudent() {
        ObjectMapper objectMapper = new ObjectMapper();
        Student student = studentFind();
        try {
            String str = objectMapper.writeValueAsString(student);
            System.out.println(str);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
}
