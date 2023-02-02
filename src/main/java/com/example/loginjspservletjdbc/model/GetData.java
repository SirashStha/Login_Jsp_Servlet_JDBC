package com.example.loginjspservletjdbc.model;

public class GetData {
    private int id;
    private String fname;
    private String lname;
    private String email;
    private String depart;
    private double salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepart() {
        return depart;
    }

    public void setDepart(String depart) {
        this.depart = depart;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "ID = " + id +
                ", First Name = '" + fname + '\'' +
                ", Last Name = '" + lname + '\'' +
                ", Email = '" + email + '\'' +
                ", Department = '" + depart + '\'' +
                ", Salary = " + salary;
    }
}

