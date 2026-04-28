package LoveBabbarQuestions.Arrays;

public class LinearSearch {
    public static void main(String[]args){
        int arr[][] = {{52,23,7},{23,4,5,23},{2},{2,3,4,5,2,-2,-33,6}};
        int target=7;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==target) {
                    System.out.println("target element index is = "+i+" ,"+j);
                    break;
                }
            }
        }
    }
}
