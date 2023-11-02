package com.school;

public class student extends Person {
    protected int IDNumber;
    protected  double fee;
    protected  int grade;

    public student(int idnumber,String MyName,int MyAge,String MyGender){
        super(MyName,MyAge,MyGender);
        this.IDNumber=idnumber;
        this.fee = fee;
        this.grade=grade;
    }
    public int getIDNumber(){
        return IDNumber;
    }
    public void setIDNumber(int ID){
        this.IDNumber=ID;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return super.toString()+"ID is"+IDNumber;
    }

}
