package com.technoelevate.functional.program.streams;

import com.technoelevate.functional.program.data.Student;
import com.technoelevate.functional.program.data.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsMapExample {

    public static List<String> getStudentName(List<Student> students) {
        return students.stream()
                .map(Student::getName)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }

    public static Set<String> getStudentNameSet(List<Student> students) {
        return students.stream()
                .map(Student::getName)
                .map(String::toUpperCase)
                .collect(Collectors.toSet());
    }

    public static void main(String[] args) {
        List<Student> students = StudentDataBase.getAllStudents();
        System.out.println(getStudentName(students));
        System.out.println(getStudentNameSet(students));
    }
}
