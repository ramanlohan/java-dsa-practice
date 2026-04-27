package LoveBabbarQuestions.Methods;

public class CreateAOverloadedMethodDisplay {
    public static void main(String[]args){
        System.out.println(overloadedIntString(6));
        System.out.println(overloadedIntString("56"));
    }
    public static int overloadedIntString(int num){
        return num;
    }
    public static String overloadedIntString(String num){
        return num;
    }
}
