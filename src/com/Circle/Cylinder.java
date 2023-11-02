package com.Circle;

public class Cylinder extends Circle  {
    private double height;

    public Cylinder(){
        height=1.0;
    }
    public  Cylinder(double height){
        this.height=height;
    }
    public  Cylinder(double r,double height){
        super(r);
    }
    public  Cylinder(double r, double height,String colour){
        super(r, colour);
    }
    public double getHeight(){
        return height;
    }
    public void setHeight(double Height){
        this.height= Height;
    }
    public  double getVolume(){
        double v;
        return  v = Math.PI*GetArea()*height;
    }

    @Override
    public String toString() {
        return super.toString()+ " height=" + height;
    }
}
