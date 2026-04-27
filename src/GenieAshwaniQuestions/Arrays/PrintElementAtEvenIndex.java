package GenieAshwaniQuestions.Arrays;

public class PrintElementAtEvenIndex {
    public static void main(String[]args){
        int arr[]={325,326,64,64,345,56,3,5,456,54};
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                System.out.print(arr[i]+" ");
            }

        }
    }
}
