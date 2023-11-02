package com.school;

public class Main {
    public static void main(String[] args) {
        Person jack = new Person("Jack",27,"M");
        System.out.println(jack);
        student beth = new student(122233, "Elisabeth Smith", 16, "F");
        System.out.println(beth);
        teacher sam = new teacher("Sam Hamilton", 34, "M", 50000,
                "Computer_Science");
        System.out.println(sam);

        Person p = new teacher ("Sam Hamilton", 34, "M", 50000,"Computer science");
       // teacher t = new Person ("Sam Hamilton", 34, "m" );
        Person s = new student (122233, "Elizabeth Smith", 16,"F" );



    }
}
