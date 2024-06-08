package org.example.techtalk.customassertions;

import java.util.List;

public class Employee {

    private String name;
    private List<String> duties;
    private String location;
    private Integer age;
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getDuties() {
        return duties;
    }

    public void setDuties(List<String> duties) {
        this.duties = duties;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
