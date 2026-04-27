package GenieAshwaniQuestions.Arrays;

public class FindMaxValueInArray {
    public static void main(String[]args){
        int arr[]={325,326,64,64,345,56,3,5,456,54};
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(max<=arr[i]){
                max=arr[i];
            }
        }
        System.out.print(max);
    }
}
