package GenieAshwaniQuestions.Arrays;

public class CountEvenAndOddNumbers {
    public static void main(String[]args){
        int arr[]={325,326,64,64,345,56,3,5,456,54};
        int countEven=0;
        int countOdd=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                countEven++;
            }
            else{
                countOdd++;
            }
        }
        System.out.print("number of even are = "+countEven+" and number of odd are = "+countOdd);
    }
}
