package oops;

import java.awt.*;

public class Circle extends GeometricObject {
    private static int  numberOfCircles;
    Point Center;
    double radius;

    Circle(){
        numberOfCircles++;
    }
    Circle(Point Center,double radius){
        this.Center = Center;
        this.radius = radius;
        numberOfCircles++;
    }
    double getPerimeter(){
        return 2* Math.PI*radius;
    }
    double getArea(){
        return  Math.PI*radius*radius;
    }
    void setRadius(double radius){
        this.radius=radius;
    }
    void setCenter(Point Center){
        this.Center=Center;
    }
    public static int getNumberOfCircles(){

        return numberOfCircles;
    }

}
