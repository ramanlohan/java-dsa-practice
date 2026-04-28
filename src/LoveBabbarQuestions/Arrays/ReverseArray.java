package LoveBabbarQuestions.Arrays;

public class ReverseArray {
    public static void main(String[]args) {
        int[] arr = {52, 23,23,53,2,3,52,1, 7};
        int start = 0;
        int end=arr.length-1;
        while (start<end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
