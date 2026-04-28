package LoveBabbarQuestions.Arrays;

public class ProductOf2DArray {
    public static void main(String[]args){
        int arr[][] = {{7},{23,4,5},{2},{2,3,4,5,2,2,-33,6}};
        int sum=1;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]>0||arr[i][j]<0) {
                    sum *= arr[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}
