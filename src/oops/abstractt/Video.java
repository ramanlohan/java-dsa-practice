package oops.abstractt;

public abstract class Video {
    protected String name;
    protected double duration;
    protected Video(String name,double duration){
        this.name=name;
        this.duration=duration;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public void setDuration(String duraiton){
        this.duration=duration;
    }
    public double getDuration(){
        return this.duration;
    }
}
