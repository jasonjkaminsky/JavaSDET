package com.syntax.class26;

public class A extends Marks {

    double chemGrade;
    double bioGrade;
    double englishGrade;

    A (double chemGrade, double bioGrade, double englishGrade){
        this.chemGrade = chemGrade;
        this.bioGrade = bioGrade;
        this.englishGrade = englishGrade;
    }

    @Override
    public double getAverage() {
        return (chemGrade + bioGrade + englishGrade) / 3;
    }



}
