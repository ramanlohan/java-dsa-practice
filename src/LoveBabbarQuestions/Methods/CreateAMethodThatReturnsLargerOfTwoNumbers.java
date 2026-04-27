package LoveBabbarQuestions.Methods;

public class CreateAMethodThatReturnsLargerOfTwoNumbers {
    public static void main(String[]args){
        System.out.print(largerNum(6,30));
    }
    public static int largerNum(int a,int b){
        int large;
        if(a>=b){
            large=a;
        }
        else{
            large=b;
        }
        return large;
    }
}
