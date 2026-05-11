package com.example.daalgavar_3;

import java.util.Arrays;
import java.util.Objects;

public abstract class Student {
    public static final int NUM_OF_TESTS = 3;
    public String name;
    public int[] test;
    public String courseGrade;

    public Student() {
        this("Unknown");
    }

    public Student(String name) {
        this.name = name;
        this.test = new int[NUM_OF_TESTS];
    }

    public Student(Student target) {
        if(target != null){
            this.name = target.name;
            this.test = target.test.clone();
            this.courseGrade = target.courseGrade;
        }
    }

    public String getCourseGrade() {
        return courseGrade;
    }
    public String getName() {
        return name;
    }
    public int getTestScore(int idx) {
        return test[idx];
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setTestScore(int idx, int score){
        this.test[idx] = score;
    }
    public abstract String computeCourseGrade();
    
    public abstract Student clone();
    @Override 
    public boolean equals(Object obj2){
        if(!(obj2 instanceof Student)) return false;
        Student student2 = (Student) obj2;
        return student2.name.equals(this.name) && Arrays.equals(student2.test, this.test) && Objects.equals(student2.courseGrade, this.courseGrade);
    }
}
