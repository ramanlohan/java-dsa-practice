package LoveBabbarQuestions.Arrays;

public class SumOfArray {
    public static void main(String[]args){
        int arr[] = {512,23,5,23,5,215,3};
        int sum=0;
        for(int i=1;i<=arr.length-1;i++){
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}
