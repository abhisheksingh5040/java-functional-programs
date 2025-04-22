package com.technoelevate.functional.program.funcationalInterface;

import com.technoelevate.functional.program.data.Student;
import com.technoelevate.functional.program.data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumerExample {

    Predicate<Student> p1 = student -> student.getGpa() >= 3;
    Predicate<Student> p2 = student -> student.getGradeLevel() >= 3.9;

    Consumer<Student> c1 = student -> System.out.print(student.getName() + " - ");
    Consumer<Student> c2 = student -> System.out.println(student.getActivities());

    public void printNameAndActivity() {
        List<Student> students = StudentDataBase.getAllStudents();
        students.forEach(student -> {
            if (p1.and(p2).test(student)) {
                c1.andThen(c2).accept(student);
            }
        });
    }

    public static void main(String[] args) {
        PredicateAndConsumerExample p = new PredicateAndConsumerExample();
        p.printNameAndActivity();
    }
}
