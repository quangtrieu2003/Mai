package com.t3h.buoi12.collectionobject;

public class Person {
    private int id;
    private String name;

    @Override
    public boolean equals(Object obj) {
        return this.id == ((Person)obj).id && this.name.equals(((Person)obj).name);
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(this.id) + this.name.hashCode();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}