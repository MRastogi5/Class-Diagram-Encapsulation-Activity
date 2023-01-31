package org.school.mathematics;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class StudentTest {
   @Test
    public void checkStudentname() {
        Student student = new Student("Harry", 'A', '2');
        String expected = "Harry";
        assertEquals(expected, String.valueOf(student.getName()));
    }

    @Test
    public void checkStudentGrade() {
        Student student = new Student("Harry", 'A', '2');
        String expected = "A";
        assertEquals(expected, String.valueOf(student.getGrade()));
    }

    @Test
    public void checkStudentGradeAfterDownGrade() {
        Student student = new Student("Harry", 'A', '2');
        student.gradeDown();
        String expected = "B";
        assertEquals(expected, String.valueOf(student.getGrade()));
    }

    @Test
    public void checkStudentGradeAfterUpGrade() {
        Student student = new Student("Harry", 'F', '2');
        student.gradeUp();
        String expected = "E";
        assertEquals(expected, String.valueOf(student.getGrade()));
    }

}
