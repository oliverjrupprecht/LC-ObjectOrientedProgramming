package com.personlocation;

class Person {
    private String name;
    private Places location;

    public Person(String name, Places location) {
        this.name = name;
        this.location = location;
    }

    public Places getLocation() {
        return location;
    }

    public String getName() {
        return name;
    }
}
