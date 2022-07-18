package com.syntax.class28;

import java.util.HashSet;

public class StudentTester {

        public static void main(String[] args) {
            //creating HashSet of Objects of Student Type
            HashSet<Student> students = new HashSet<>();

            // creating students
            Student stu1 = new Student("Steve", 483938);
            Student stu2 = new Student("Billy", 930223);
            Student stu3 = new Student("Maggie", 463821);

            // Adding students to HashSet
            students.add(stu1);
            students.add(stu2);
            students.add(stu3);

            //printing only the name of each student
            for (Student student : students){
                System.out.println(student.name);
            }
        }

    }
