package com.Circle;

public class Main {
    public static void main(String[] args) {

        Cylinder c1 = new Cylinder();
        System.out.println(c1.getRadius()+"  "+ c1.GetArea()+"  "+c1.getHeight()+"  "+c1.getVolume()+"  "+c1.GetArea());
Cylinder c2 = new Cylinder(5);
        System.out.println(c2.getRadius()+"  "+c2.getHeight()+"  "+c2.GetArea()+"  "+c2.getVolume()
        );
        Cylinder c3 = new Cylinder(5.0, 10.0);
        System.out.println("Cylinder:"
                + " radius=" + c3.getRadius()
                + " height=" + c3.getHeight()
                + " base area=" + c3.GetArea()
                + " volume=" + c3.getVolume());

    }
}