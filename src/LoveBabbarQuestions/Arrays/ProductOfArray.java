package LoveBabbarQuestions.Arrays;

public class ProductOfArray {
    public static void main(String[]args){
        int arr[] = {512,23,5,23,0,5,215,3};
        int Product=1;
        for(int i=1;i<=arr.length-1;i++){
            if(arr[i]>0){
                Product*=arr[i];
            }
        }
        System.out.println(Product);
    }
}
