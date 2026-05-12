package com.example.daalgavar_3;

public class UndergraduateStudent extends Student{
    public UndergraduateStudent() {
        super();
    }
    public UndergraduateStudent(String name) {
        super(name);
    }
    public UndergraduateStudent(UndergraduateStudent target) {
        super(target);
    }
    
    @Override
    public Student clone() {
        return new UndergraduateStudent(this);
    }
    @Override
    public boolean equals(Object obj2) {
        if(!(obj2 instanceof UndergraduateStudent) || !super.equals(obj2)) return false;
        // UndergraduateStudent student2 = (UndergraduateStudent) obj2;
        // return student2.courseGrade == this.courseGrade;
        return true;
    }
    @Override
    public String computeCourseGrade() {
        int sum = 0;
        for(int i = 0; i < Student.NUM_OF_TESTS;  i++){
            sum += test[i];
        }
        double avg  = (double) sum / Student.NUM_OF_TESTS;
        if(avg >= 90) {
            courseGrade = "pass";
        }
        else {
            courseGrade = "Fail";
        }
        return courseGrade;
    }
}