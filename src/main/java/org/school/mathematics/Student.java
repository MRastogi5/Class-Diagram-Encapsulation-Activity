package org.school.mathematics;

import java.util.List;

public class Student {

    public static final int ONE = 1;
    public static final int ZERO = 0;
    private String name;
    private char grade;
    private char group;
    private static final String secretNickname = "MySecretNickName";
    private List<Character> gradeList = List.of('F','E','D','C','B','A');

    private List<Character> groupList = List.of('1','2','3','4','5');


    public Student(String name, char grade, char group) {
        this.name = name;
        if(gradeList.contains(grade)){
            this.grade = grade;
        }
        else {
            throw new IllegalArgumentException("Invalid Grade.");
        }
        if(groupList.contains(group)){
            this.group = group;
        }
        else {
            throw new IllegalArgumentException("Invalid Group.");
        }
    }

    public String getName() {
        return name;
    }

    public char getGrade() {
        return grade;
    }

    public void gradeUp(){
        int index = gradeList.indexOf(grade);
        if(index<gradeList.size() - ONE){
            grade = (char) gradeList.get(++index);
        }
    }
    public void gradeDown(){
        int index = gradeList.indexOf(grade);
        if(index > ZERO){
            grade = (char) gradeList.get(--index);
        }
    }

}
