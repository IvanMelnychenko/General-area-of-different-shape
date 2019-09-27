package com.gmail.liftiwan1996;

public class Circle extends Shape {
    private double radius;

    public Circle() {
        super();
    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double findAreaCr(){
       double areaCircle = Math.PI * Math.pow(2, radius);
        return areaCircle;
    }
}
