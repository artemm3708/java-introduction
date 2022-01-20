package com.hillel.homework.hw11;

public class Family {

    String name;
    String surname;
    boolean isParent = false;

    public void parent(Family member) {
        this.isParent = true;
        this.surname = member.surname;
    }

    public void printParent(Family member) {
        if (this.isParent = true) {
            System.out.println("Является родителем " + member.name);
        }
    }

    public String toString() {
        return "Имя: " + name + ", фамилия: " + surname;
    }







}
