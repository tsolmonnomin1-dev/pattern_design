package com.example.daalgavar_2;

public class Bird extends Pet {
    public Bird(String name) {
        super(name);
    }
    @Override
    public String speak(){
        return super.getName() + " is a bird.";
    }
}
