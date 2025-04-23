package com.technoelevate.functional.program.streams;

import com.technoelevate.functional.program.data.Student;
import com.technoelevate.functional.program.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterExample {

    public static List<Student> filterStudents(List<Student> students) {
        return students.stream()
                .filter(student -> student.getGpa() >= 4.0)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Student> students = StudentDataBase.getAllStudents();
        filterStudents(students).forEach(System.out::println);
    }
}
