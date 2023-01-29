package com.kulpreet.springBoot1.department;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Department {

    @Id
    private long id;
    private String name;
    private String description;
    private int strength;

    public Department() {
    }

    public Department(String name, String description, int strength) {
        this.name = name;
        this.description = description;
        this.strength = strength;
    }

    public Department(long id, String name, String description, int strength) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.strength = strength;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
}
