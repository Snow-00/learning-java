package com.myjava.javapack;

public class PersonPack implements Comparable<PersonPack> {
    private String name;
    private String address;

    public PersonPack(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public int compareTo(PersonPack o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "PersonPack{" +
            "name='" + name + "\'" +
            ", address='" + address + "\'" +
            "}";
    }
}
