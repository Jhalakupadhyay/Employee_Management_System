package com.aryancodes.departmentservice.model;

public class Employee {
    Long id;
    Long departmentId;
    String name;
    int age;
    String position;

    public Employee() {
    }

    public Employee(Long id, Long departmentId, String name, int age, String position) {
        this.id = id;
        this.departmentId = departmentId;
        this.name = name;
        this.age = age;
        this.position = position;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
