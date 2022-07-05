package com.syntax.class26;

class B extends Marks{

    double mathGrade;
    double historyGrade;
    double artGrade;
    double scienceGrade;

    public B (double mathGrade, double historyGrade, double artGrade, double scienceGrade){
        this.mathGrade = mathGrade;
        this.historyGrade = historyGrade;
        this.artGrade = artGrade;
        this.scienceGrade = scienceGrade;
    }


    @Override
    public double getAverage(){
        return (mathGrade + historyGrade + artGrade + scienceGrade) / 4;
    }

    }
