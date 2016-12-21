package com.example.csaper6.collegeapp.Model;

/**
 * Created by csaper6 on 12/9/16.
 */
public class Sibling extends Person {

    private String relationship;
    private int age;

    public Sibling()
    {
        relationship = "vaguely related";
        age = 12;
    }

    public Sibling(String relationship, int age) {
        this.relationship = relationship;
        this.age = age;
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
}


