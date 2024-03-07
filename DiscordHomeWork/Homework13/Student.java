package Teme.DiscordHomeWork.Homework13;

public class Student {

    String name;
    int age;


    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

}
