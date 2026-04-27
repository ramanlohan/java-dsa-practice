package LoveBabbarQuestions.Methods;

public class WriteAMethodToUpdateValueAndVerifyThatOriginalVariableInMainDoesNotChange {
    public static void main(String[]args){
        int x=10;
        System.out.println("method x is = "+setX(x));
        System.out.println("original method x is = "+x);
    }
    public static int setX(int x){
        x=50;
        return x;
    }
}
