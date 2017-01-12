package com.example.csaper6.collegeapp.Model;

/**
 * Created by csaper6 on 12/9/16.
 */
public class Sibling extends Person {

    private String relationship, firstName, lastName;
    private int age;


    public Sibling()
    {
        firstName = "yohan";
        lastName = "Kim";
        relationship = "vaguely related";
        age = 12;
    }

    public Sibling(String firstName, String lastName, int age, String realationship)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.relationship = realationship;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}


