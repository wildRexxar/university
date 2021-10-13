package entity;

import java.util.List;
import java.util.Objects;

public class Group{
    private String number;
    private List<Student> listOfStudents;

    public Group(String number, List<Student> listOfStudents) {
        this.number = number;
        this.listOfStudents = listOfStudents;
    }

    public Group(String number) {
        this.number = number;
    }

    public List<Student> getListOfStudents() {
        return listOfStudents;
    }

    public void setListOfStudents(List<Student> listOfStudents) {
        this.listOfStudents = listOfStudents;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Группа номер " + number + " ";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Group) {
            Group group = (Group) obj;
            return group.number.equals(this.number);
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }
}
