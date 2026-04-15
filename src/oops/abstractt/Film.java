package oops.abstractt;

public class Film extends Video {
    private String type;
    private String star;

    protected Film(String name, double duration,String type,String star) {
        super(name, duration);
        this.type=type;
        this.star=star;
    }
    public void setType(String type){
        this.type=type;
    }
    public String getType(){
        return this.type;
    }
    public void setStar(String star){
        this.star=star;
    }
    public String getStar(){
        return this.star;
    }
    @Override
    public String toString(){
        return "Film{" +
                "type='" + type + '\'' +
                ",star='" + star + '\'' +
                ", name='" + name + '\'' +
                ",duration=" + duration +
                '}';

    }
}
