package org.school.mathematics;

import java.util.ArrayList;
import java.util.List;

public class Student {

    public static final int ONE = 1;
    public static final int ZERO = 0;
    private String name;
    private char grade;
    private char group;
    private String secretNickname = "MySecretNickName";
    private List gradeList = new ArrayList<Character>();

    private List groupList = new ArrayList<Character>();

    {
        gradeList.add('F');
        gradeList.add('E');
        gradeList.add('D');
        gradeList.add('C');
        gradeList.add('B');
        gradeList.add('A');

        groupList.add(1);
        groupList.add(2);
        groupList.add(3);
        groupList.add(4);
        groupList.add(5);


    }
    public Student(String name, char grade, char group) {
        this.name = name;
        if(gradeList.contains(grade)){
            this.grade = grade;
        }
        if(groupList.contains(group)){
            this.group = group;
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
        System.out.println("index :" + index);
        if(index<gradeList.size()- ONE){
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
