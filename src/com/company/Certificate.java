package com.company;

public class Certificate {
    private String name;
    private int year;

    public Certificate(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }
}
