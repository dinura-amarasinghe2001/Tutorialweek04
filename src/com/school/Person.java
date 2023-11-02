package com.school;

public class Person {
    protected String MyName;
    protected int MyAge;
    protected String MyGender;

    public Person(String MyName,int MyAge,String MyGender){
        this.MyName = MyName;
        this.MyAge=MyAge;
        this.MyGender=MyGender;
    }
    public String getMyName(){return getMyName(); }
    public int getMyAge(){return  getMyAge();}
    public  String getMyGender(){return getMyGender();}

    public void setMyName(String Name){
        this.MyName = Name;
    }
    public void setMyAge(int Age){
        this.MyAge = Age;
    }
    public  void setMyGender(String Gender){
        this.MyGender= Gender;
    }


    public String toString() {
        return "Person{" +
                "MyName='" + MyName + '\'' +
                ", MyAge=" + MyAge +
                ", MyGender='" + MyGender + '\'' +
                '}';
    }
}
