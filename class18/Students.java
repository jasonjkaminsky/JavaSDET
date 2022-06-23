package com.syntax.class18;

public class Students {

    String name;
    int grade1;
    int grade2;
    int grade3;


    public Students(String name,int grade1,int grade2,int grade3) {
       this.name = name;
       this.grade1 = grade1;
       this.grade2 = grade2;
       this.grade3 = grade3;
    }

int avgGrade (){
    return (grade1 + grade2 + grade3) / 3;
}

    public static void main(String[] args) {
        Students s1 = new Students("Billy", 86, 68, 95);
        System.out.println(s1.name + "'s average grade is: " + s1.avgGrade());
        Students s2 = new Students("Becky", 79, 86, 48);
        System.out.println(s2.name + "'s average grade is: " + s2.avgGrade());
        Students s3 = new Students("Lacey", 87, 98, 87);
        System.out.println(s3.name + "'s average grade is: " + s3.avgGrade());
        Students s4 = new Students("Zeke", 58, 76, 92);
        System.out.println(s4.name + "'s average grade is: " + s1.avgGrade());
        Students s5 = new Students("George", 91, 67, 90);
        System.out.println(s5.name + "'s average grade is: " + s5.avgGrade());

    }
    }

