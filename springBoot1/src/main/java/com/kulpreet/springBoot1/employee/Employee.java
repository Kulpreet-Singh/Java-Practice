package com.kulpreet.springBoot1.employee;

import com.kulpreet.springBoot1.department.Department;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;
import java.time.LocalDate;
import java.time.Period;

@Entity
public class Employee {
    @Id
    private long id;
    private String name;
    private String email;
    private LocalDate dob;
    @Transient
    private int age;
    private String role;

    @ManyToOne
    private Department department;

    public Employee() {

    }

    public Employee(long id, String name, String email, LocalDate dob, String role, long departmentId) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.role = role;
        this.department = new Department(departmentId,
                "", "", 0);
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public int getAge() {
        return Period.between(this.dob, LocalDate.now()).getYears();
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
