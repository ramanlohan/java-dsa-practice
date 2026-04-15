package oops.abstractt;

public class Rectangle extends GeoObject implements Drawable{
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
    @Override
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

    @Override
    public  void draw() {
        System.out.println("Drawing Rectangle"+this.width+" "+this.height);
    }
}
