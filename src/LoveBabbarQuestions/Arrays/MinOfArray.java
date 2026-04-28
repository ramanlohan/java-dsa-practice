package LoveBabbarQuestions.Arrays;

public class MinOfArray {
    public static void main(String[]args){
        int arr[] = {52,23,5,23,0,5,215,-3,3};
        int min=arr[0];
        for(int i=1;i<=arr.length-1;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(min);
    }
}
