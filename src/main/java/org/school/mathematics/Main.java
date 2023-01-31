package org.school.mathematics;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Po", 'F', '2');

        System.out.println(student.getName());
        System.out.println(student.getGrade());
        //student.gradeUp();
        System.out.println("After grade up :" + student.getGrade());
        student.gradeDown();
        System.out.println("After grade down :" + student.getGrade());


        System.out.println("Hello world!");
    }
}