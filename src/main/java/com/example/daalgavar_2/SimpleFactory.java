package com.example.daalgavar_2;

public class SimpleFactory {
    public static Pet createPet(String type, String name) {
        if("Dog".equals(type)) return new Dog(name);
        if("Cat".equals(type)) return new Cat(name);
        if("Bird".equals(type)) return new Bird(name);
        throw new IllegalArgumentException("Unknown type");
    }
}
 