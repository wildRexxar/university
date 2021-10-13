package entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private List<Integer> marks = new ArrayList<>();

    public Student(){}

    public Student(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Integer> getMarks() {
        return marks;
    }

    public void setMarks(List<Integer> marks) {
        this.marks = marks;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student) {
            Student student = (Student) obj;
            return student.id == this.id && student.firstName.equals(this.firstName) &&
                    student.lastName.equals(this.lastName);
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName);
    }

    @Override
    public String toString() {
        return "Студент : " + firstName + " " + lastName + "\nid номер: " + id +
                "\nОценки : " + marks + "\n*************************************\n";
    }
}