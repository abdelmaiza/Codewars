package org.example;

import org.example.model.Student;
import java.util.function.Function;

/*
 * https://www.codewars.com/kata/54a6b43e478d8ee14c000a5d/train/java
 */
public class FunctionalProgramming {

    public static final Function<Student, Boolean> f =  student -> student.getFullName().equals("John Smith") && student.studentNumber.equals("js123");//Make me a function; remember to set the types!
}
