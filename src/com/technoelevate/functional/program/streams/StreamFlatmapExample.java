package com.technoelevate.functional.program.streams;

import com.technoelevate.functional.program.data.Student;
import com.technoelevate.functional.program.data.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFlatmapExample {

    public static List<String> printListOfActivities(List<Student> students) {
        return students.stream()
                .flatMap(student -> student.getActivities().stream())
                .collect(Collectors.toList());
    }

    public static Set<String> printListOfSetActivities(List<Student> students) {
        return students.stream()
                .map(student -> student.getActivities())//Stream<List<String>>
                .flatMap(List::stream)//Stream<String>
                .collect(Collectors.toSet());
    }

    public static List<String> printListOfDistinctActivities(List<Student> students) {
        return students.stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .collect(Collectors.toList());
    }

    public static long countListOfActivities(List<Student> students) {
        return students.stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .count();
    }

    public static List<String> printListOfActivitiesInSorted(List<Student> students) {
        return students.stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Student> students = StudentDataBase.getAllStudents();
        System.out.println(printListOfActivities(students));
        System.out.println(printListOfSetActivities(students));
        System.out.println(printListOfDistinctActivities(students));
        System.out.println(countListOfActivities(students));
        System.out.println(printListOfActivitiesInSorted(students));
    }
}
