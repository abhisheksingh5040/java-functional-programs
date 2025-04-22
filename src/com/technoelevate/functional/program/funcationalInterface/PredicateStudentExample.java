package com.technoelevate.functional.program.funcationalInterface;

import com.technoelevate.functional.program.data.Student;
import com.technoelevate.functional.program.data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {

    static Predicate<Student> p1 = student -> student.getGpa() >= 3;
    static Predicate<Student> p2 = student -> student.getGradeLevel() >= 3.9;

    public static void studentPredicate(){
        List<Student> students = StudentDataBase.getAllStudents();
        students.forEach(student -> {
            if(p1.and(p2).test(student)){
                System.out.println(student);
            }
        });
    }

    public static void main(String[] args) {
        studentPredicate();
    }
}
