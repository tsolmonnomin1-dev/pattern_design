package com.example.daalgavar_2;

public class Pet {
    private String name;
    public Pet(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String speak() {
        return "I am a pet.";
    }
}
