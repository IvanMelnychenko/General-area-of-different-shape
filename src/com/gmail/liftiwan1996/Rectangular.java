package com.gmail.liftiwan1996;

public class Rectangular extends Shape {
    private double side1;
    private double side2;
    public Rectangular() {
        super();
    }
    public Rectangular(double side) {
        super(side);
    }
    public Rectangular(double side1, double side2) {
        super();
        this.side1 = side1;
        this.side2 = side2;
    }
    public double getSide1() {
        return side1;
    }
    public void setSide1(double side1) {
        this.side1 = side1;
    }
    public double getSide2() {
        return side2;
    }
    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double findAreaRec(){
        double areaRectangular = side1*side2;
        return areaRectangular;
    }
}
