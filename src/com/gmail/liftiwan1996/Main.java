package com.gmail.liftiwan1996;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList();
        Squares sq = new Squares(10);
        shapes.add(sq);

        Rectangular rec = new Rectangular(4, 6);
        shapes.add(rec);

        Circle cr = new Circle(7);
        shapes.add(cr);

        double areaGen = sq.findAreaSq() + rec.findAreaRec() + cr.findAreaCr();
        System.out.println("General area of these figures is " + areaGen);
    }
}
