package LoveBabbarQuestions.Arrays;

public class MaxOfArray {
    public static void main(String[]args){
        int arr[] = {52,23,5,23,0,5,215,3};
        int max=arr[0];
        for(int i=1;i<=arr.length-1;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
