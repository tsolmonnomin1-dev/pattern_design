package com.example.daalgavar_2;

public class Cat extends Pet  {
    public Cat(String name) {
        super(name);
    }
    @Override
    public String speak() {
        return super.getName() + " is a cat."; 
    }
}
