package com.company;

import java.lang.invoke.VolatileCallSite;

class Circle{
    double radius; String colour;

    Circle()
    {
        radius=0;
        colour="RED";
    }
    public Circle(double radius) {
        this();
        this.radius = radius;


    }

    public Circle(double radius, String colour) {
        this.radius = radius;
        this.colour = colour;
    }

    double getRadius(){
        return radius;
    }

    double getArea(){
        return Math.PI*radius*radius;
    }
}

class Cylinder extends Circle{
    double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cylinder() {
        super();height=0;
    }

    public Cylinder(double radius, String colour, double height) {
        super(radius, colour);
        this.height = height;
    }

    public double getHeight(){
        return height;
    }
    public  double getVolume(){
        return super.getArea()*height;
    }

    public double getArea(){
        return (2*super.getArea())+(Math.PI*2*radius*height);
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "radius=" + radius +
                ", colour='" + colour + '\'' +
                ", height=" + height +
                '}';
    }
}

public class P3 {
    public static void main(String[] args) {
        Cylinder c1=new Cylinder(5,"white",2);
        Cylinder c2= new Cylinder(5,3);

        System.out.println(c1+" "+c1.getVolume()+" "+ c1.getArea());
        System.out.println(c2+" "+c2.getVolume()+" "+ c2.getArea());

        if(c1.colour.equals(c2.colour) && c1.getArea()==c2.getArea()&& c1.getVolume()==c2.getVolume()){
            System.out.println("Both are same cylinders");
        }
        else {
            System.out.println("Both are different cylinders");
        }
        }

    }

