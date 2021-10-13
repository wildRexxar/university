package entity;

import java.util.List;

public class University {
    private String name;
    private List<Group> listOfGroups;

    public University() {
    }

    public University(String number, List<Group> listOfGroups) {
        this.name = number;
        this.listOfGroups = listOfGroups;
    }

    public String getNumber() {
        return name;
    }

    public void setNumber(String number) {
        this.name = number;
    }

    public List<Group> getListOfGroup() {
        return listOfGroups;
    }

    public void setListOfGroup(List<Group> listOfGroups) {
        this.listOfGroups = listOfGroups;
    }

    @Override
    public String toString() {
        return "Название университета " + name + "\nКоличество групп : " + listOfGroups.size();
    }
}