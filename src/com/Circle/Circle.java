package com.Circle;

import java.awt.geom.Area;

public class Circle {

    private double radius;
    private String color;
    public Circle(){
        radius = 1.0;
    color="blue";}
public  Circle(double r, String colour){
        this.radius=r;
        this.color=colour;
}
public Circle(double r){
        this.radius=r;
}
public double getRadius(){
        return radius;
}
public void setRadius(double r){
        this.radius=r;
}
public String getColor(){
        return color;
}
public void setColor(String Color){
        this.color=Color;
}
public double GetArea(){
        double Area = Math.PI*radius*radius;
        return Area;
}


    public String toString() {
        return "radius is"+radius +  "Color is"+color +"Area is"+ GetArea();


    }
}
