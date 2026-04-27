package GenieAshwaniQuestions.Arrays;

public class SearchElementInArray {
    public static void main(String[]args){
        int arr[]={325,326,64,64,345,10,56,3,5,456,54};
        int target=10;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.println(i);
            }
        }

    }
}
