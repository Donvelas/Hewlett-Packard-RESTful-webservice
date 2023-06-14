package com.hp.restful;

public class Employee {
    public Employee() {}

    public Employee(Integer id, String firstName, String lastName, String email, String title) {
        super();
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.title = title;
    }

    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private String title;

    @Override
    public String toString() {
        return "Employee [employee_id=" + id + ", firstName=" + firstName +
                ", lastName=" + lastName + ", email=" + email + ", title=" + title + "]";
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
