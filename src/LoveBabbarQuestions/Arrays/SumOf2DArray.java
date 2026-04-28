package LoveBabbarQuestions.Arrays;

public class SumOf2DArray {
    public static void main(String[]args){
        int arr[][] = {{52,23,7},{23,4,5,23},{2},{2,3,4,5,2,-2,-33,6}};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                sum+=arr[i][j];
            }
        }
        System.out.println(sum);
    }
}
