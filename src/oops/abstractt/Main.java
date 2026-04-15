package oops.abstractt;

import java.io.FileReader;

public class Main {
    public static void main(String[]args){
        Drawable Rectangle = new Rectangle(3,5);
        Drawable Circle = new Circle(2.4);
        Rectangle.draw();
        Circle.draw();


    }
}
