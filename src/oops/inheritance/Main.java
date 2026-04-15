package oops.inheritance;

public class Main extends C1{
    public Main(){
        System.out.println("Main");

    }
    public static void main(String[]args){
        new Main();
        Main one= new Main();
        System.out.println(one.toString());
    }

}
class C1 extends C2 {
    C1() {
        this("C1 overloaded constructor");
        System.out.println("C1");
    }
    public C1(String s){System.out.println(s);}
}
class C2   {
    C2(){
        System.out.println("C2");
    }

}

