package com.technoelevate.functional.program.streams;

import com.technoelevate.functional.program.data.Student;
import com.technoelevate.functional.program.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsComparatorExample {

    public static List<Student> sortStudentByName(List<Student> students){
        return students.stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList());
    }

    public static List<Student> sortStudentByGpaDesc(List<Student> students){
        return students.stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed())
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Student> students = StudentDataBase.getAllStudents();
        sortStudentByName(students).forEach(System.out::println);
        sortStudentByGpaDesc(students).forEach(System.out::println);
    }
}
