package com.example.daalgavar_2;

public class Dog extends Pet{
    public Dog(String name) {
        super(name);
    }
    @Override 
    public String speak() {
        return super.getName() + " is a dog.";
    }
}
