package oops;

public class Rectangle extends GeometricObject {
    private double width;
    private double height;

    public Rectangle() {
        this(true,"black",1, 1);
    }

    public Rectangle(double width, double height) {
        this(true,"black",width,height);

    }
    public Rectangle(boolean isFilled,String color,double width, double height){
        super(isFilled,color);
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return 2 * (this.width + this.height);
    }

    public double getHeight() {
        return this.height;

    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public boolean equals(Object obj){
        if(!(obj instanceof Rectangle)) return false;
        return this.height == ((Rectangle)obj).height && this.width==((Rectangle)obj).width;
    }
}
