package LoveBabbarQuestions.Methods;

public class CreateAMethodToCheckIfNumberIsEven {
    public static void main(String[]args){
        CheckEven(1352);
    }
    public static boolean CheckEven(int num){
        if(num%2==0){
            System.out.println("it's even");
            return true;
        }
        else{
            System.out.println("it's not even");
            return false;
        }
    }
}
