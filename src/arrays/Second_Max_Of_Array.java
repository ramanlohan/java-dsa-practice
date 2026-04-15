package arrays;

public class Second_Max_Of_Array {
    public static void main(String[]args){
        int[] arr={14,342,2352,1,5341,5321,5,25,215,235};
        int largest=arr[0];
        int secondLargest=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];
            }
            if(arr[i]<largest&&arr[i]>secondLargest){
                secondLargest=arr[i];
            }
        }
        System.out.println(secondLargest);
    }
}
