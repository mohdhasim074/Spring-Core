package com.springcore.collection;
//  This is our bean class;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Emp {

    private String name;
    private List<String> phones;
    private Set<String> addresess;
    private Map<String, String> courses;

    // default constructors
    public Emp(String name, List<String> phones, Set<String> addresess, Map<String, String> courses) {
        super();
        this.name = name;
        this.phones = phones;
        this.addresess = addresess;
        this.courses = courses;
    }

    // constructors using feilds
    public Emp() {
        super();
        // TODO Auto-generated constructor stub
    }

    // Setters & Getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getPhones() {
        return phones;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }

    public Set<String> getAddresess() {
        return addresess;
    }

    public void setAddresess(Set<String> addresess) {
        this.addresess = addresess;
    }

    public Map<String, String> getCourses() {
        return courses;
    }

    public void setCourses(Map<String, String> courses) {
        this.courses = courses;
    }

    // to String

}
