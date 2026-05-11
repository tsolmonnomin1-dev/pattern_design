package com.example.daalgavar_3;

import java.util.ArrayList;
import java.util.List;

public class MainProgram {
    public static void main(String[] args) {
        List<Student> st = new ArrayList<>();
        List<Student> stCopy = new ArrayList<>();
        
        UndergraduateStudent u = new UndergraduateStudent("John");
        u.setTestScore(0, 90);
        u.setTestScore(1, 85);
        u.setTestScore(2, 95);
        st.add(u);

        GraduateStudent g = new GraduateStudent("Mary");
        g.setTestScore(0, 88);
        g.setTestScore(1, 92);
        g.setTestScore(2, 90);
        st.add(g);
    
        for(Student s: st ) {
            stCopy.add(s.clone());
            System.out.println(s.getName() + ": " + s.computeCourseGrade());
        }
        for(Student sCopy: stCopy ) {
            System.out.println("Copy: " + sCopy.getName() + ": " + sCopy.computeCourseGrade());
        }


        for (int i = 0; i < st.size(); i++) {
            Student original = st.get(i);
            Student copy = stCopy.get(i);
            System.out.println("Are they equal: " + original.equals(copy));
            System.out.println("Are they same object: " + (original == copy));
            System.out.println();
        }

    }
}
