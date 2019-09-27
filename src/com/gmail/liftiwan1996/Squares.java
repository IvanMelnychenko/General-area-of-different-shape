package com.gmail.liftiwan1996;

public class Squares extends Shape {
    private double side;

    public Squares() {
        super();
    }

    public Squares(double side) {
        super(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double findAreaSq() {
        double areaSq = Math.pow(2, side);
        return areaSq;
    }
}
