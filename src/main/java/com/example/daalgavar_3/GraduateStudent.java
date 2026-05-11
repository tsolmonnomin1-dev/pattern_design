package com.example.daalgavar_3;

public class GraduateStudent extends Student{ 
    public GraduateStudent(){
        super();
    }
    public GraduateStudent(String name) {
        super(name);
    }
    public GraduateStudent(GraduateStudent target) {
        super(target);
    }
    @Override
    public Student clone() {
        return new GraduateStudent(this);
    }

    @Override 
    public boolean equals(Object obj2) {
        if(!(obj2 instanceof GraduateStudent) || !super.equals(obj2)) return false;
        /*GraduateStudent student2 = (GraduateStudent) obj2;
        return student2.courseGrade == this.courseGrade;*/
        return true;
    }
    @Override
    public String computeCourseGrade() {
        int sum = 0;
        for(int i = 0; i < Student.NUM_OF_TESTS;  i++){
            sum += test[i];
        }
        double avg  = (double) sum / Student.NUM_OF_TESTS;
        if(avg >= 80) {
            courseGrade = "pass";
        }
        else {
            courseGrade = "fail";
        }
        return courseGrade;
    }
}
