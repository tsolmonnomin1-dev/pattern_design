package com.example.daalgavar_2;

public class Main {
    public static void main(String[] args) {
        Pet p1 = SimpleFactory.createPet("Dog", "Buddy");
        Pet p2 = SimpleFactory.createPet("Cat", "Mikie");
        Pet p3 = SimpleFactory.createPet("Bird", "Tweety");
        System.out.println(p1.speak());
        System.out.println(p2.speak());
        System.out.println(p3.speak());
    }
}
