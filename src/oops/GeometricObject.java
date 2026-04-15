package oops;

public class GeometricObject {

    private boolean isFilled;
    private String color;
    public GeometricObject(){}
    public GeometricObject(boolean isFilled,String color){
        this.isFilled=isFilled;
        this.color=color;
    }

    boolean getIsFilled(){
        return isFilled;
    }
     String getColor(){
        return color;
    }
     void setIsFilled(boolean isFilled){
        this.isFilled=isFilled;
    }
     void setColor(String color){
        this.color=color;
    }
    @Override
    public String toString(){
        return "GeoObject{"+
                "isFilled="+isFilled+
                ",color="+color+'\''+"}";
    }

}
