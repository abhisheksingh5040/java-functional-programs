package com.technoelevate.functional.program.funcationalInterface;

import com.technoelevate.functional.program.data.Student;
import com.technoelevate.functional.program.data.StudentDataBase;

import java.util.List;
import java.util.function.Function;

public class FunctionStudentExample {

    static Function<List<Student>, Integer> function = students -> {
        return students.size();
    };

    public static void main(String[] args) {
        List<Student> students = StudentDataBase.getAllStudents();
        Integer size = function.apply(students);
        System.out.println(size);
    }
}
