package com.school;

public class teacher extends Person {
    protected  double Salary;
    protected  String Subject;

    public  teacher(String MyName,int MyAge,String MyGender,double salary,String subject){
        super(MyName,MyAge,MyGender);
        this.Salary=salary;
        this.Subject=subject;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String subject) {
        Subject = subject;
    }

    @Override
    public String toString() {
        return super.toString()+Subject+Salary;
    }
}
