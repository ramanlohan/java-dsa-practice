package oops.abstractt;

import java.awt.*;

public  class Circle extends GeoObject implements Drawable{
    private static int  numberOfCircles;
    Point Center;
    double radius;

    public Circle(){
        numberOfCircles++;
    }
    public Circle(double radius){
        this.radius=radius;
    }
    public Circle(Point Center,double radius){
        this.Center = Center;
        this.radius = radius;
        numberOfCircles++;
    }
    public double getPerimeter(){
        return 2* Math.PI*radius;
    }

    public void setRadius(double radius){
        this.radius=radius;
    }
    public void setCenter(Point Center){
        this.Center=Center;
    }
    public static int getNumberOfCircles(){

        return numberOfCircles;
    }
    @Override
    public double getArea(){
        return radius*radius*Math.PI;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle with radius" + this.radius);
    }
}
