package com.websoft.java8learn02;

/**
 * Created by bpld096 on 28/09/2015.
 */
public class Employee {

    private Integer id;
    private Integer age;
    private String gender;
    private String firstName;
    private String surName;

    public Employee(Integer id, Integer age, String gender, String firstName, String surName) {
        this.setId(id);
        this.setAge(age);
        this.setGender(gender);
        this.setFirstName(firstName);
        this.setSurName(surName);
    }

    public String toString() {
        return "\n" + this.getId().toString() + ". " +
                this.getFirstName() + " " + this.getSurName() + ", " +
                this.getAge().toString() + ", " +
                this.getGender();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }
}
