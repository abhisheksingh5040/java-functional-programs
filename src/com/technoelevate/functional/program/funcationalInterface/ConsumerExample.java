package com.technoelevate.functional.program.funcationalInterface;

import com.technoelevate.functional.program.data.Student;
import com.technoelevate.functional.program.data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    static Consumer<Student> cs = (student) -> System.out.println(student);
    static Consumer<String> consumer = (str) -> System.out.println(str.toUpperCase());
    static Consumer<Student> names = student -> System.out.print(student.getName());
    static Consumer<Student> activities = student -> System.out.println(student.getActivities());

    public static void main(String[] args) {
        consumer.accept("java8");
        printName();
        printNameAndActivities();
        System.out.println("-------------------");
        printNameAndActivitiesUsingCondition();
    }

    public static void printName() {
        List<Student> students = StudentDataBase.getAllStudents();
        students.forEach(cs);
    }

    public static void printNameAndActivities() {
        List<Student> students = StudentDataBase.getAllStudents();
        students.forEach(names.andThen(activities));
    }

    public static void printNameAndActivitiesUsingCondition() {
        StudentDataBase.getAllStudents().forEach(student -> {
            if (student.getGpa() > 3.5) {
                names.andThen(activities).accept(student);
            }
        });
    }
}
