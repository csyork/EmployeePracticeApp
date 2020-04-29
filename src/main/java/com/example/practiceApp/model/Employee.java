package com.example.practiceApp.model;

public class Employee {
    private long id;
    private String name;
    private String department;
    private int age;

    public Employee() {
    }

    public Employee(long id, String name, String department, int age) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.age = age;
    }



    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public int getAge() {
        return age;
    }
}
