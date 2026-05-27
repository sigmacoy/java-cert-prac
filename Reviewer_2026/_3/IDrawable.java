package Reviewer_2026._3;

import java.util.*;

interface IDrawable {
    void draw();
}

class InvalidShapeException extends RuntimeException {
    public InvalidShapeException(){
        super("Invalid shape parameters.");
    }
}

abstract class Shape implements IDrawable {
    private String color;

    public Shape(String c){
        color = c;
    }

    public abstract void draw();

    public String getColor(){
        return color;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(String c, double r){
        super(c);
        if(r <= 0){
            throw new InvalidShapeException();
        }
        radius = r;
    }

    public void draw(){
        System.out.println("Drawing a " + getColor() + " circle with radius " + Double.toString(radius) + ".");
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String c, double w, double h){
        super(c);
        if(h <= 0 || w <= 0){
            throw new InvalidShapeException();
        }
        width = w;
        height = h;
    }

    public void draw(){
        System.out.println("Drawing a " + getColor() + " rectangle of width " + Double.toString(width) + " and height " + Double.toString(height) + ".");
    }
}

class ShapeDrawer {
    private ArrayList<Shape> shapes;

    public ShapeDrawer(){
        shapes = new ArrayList();
    }

    public void addShape(Shape s){
        shapes.add(s);
    }

    public void drawShapes(){
        for(Shape s : shapes){
            s.draw();
        }
    }
}
