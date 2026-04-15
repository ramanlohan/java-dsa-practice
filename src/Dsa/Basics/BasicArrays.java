package Dsa.Basics;

public class BasicArrays {
    public static void main(String[]args){
        int[] arr={234,131,2343,345,708,253,1,3,51,8,3,5};
//        print array
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            System.out.print(" ");
        }
        System.out.println();
//        sum of array
        int total=0;
        for(int i=0;i<arr.length;i++){
             total+=arr[i];
        }
        System.out.println("sum of array is "+total);
//        Max and min element of array
        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("max of array is = " +max+" and min of array is = "+min);
//        count even
        int even=0;
        int odd=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("Even numbers in array are = "+even+" and odd numbers in array are "+odd);
//        linear search
//        find 8 in array
        int num=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==8){
                num=i;
            }
        }
        System.out.println("your number is on index = "+num);
//        reverse array
        int[] rev=new int[12];
        int j=0;
        for(int i=arr.length-1;i>=0;i--){
            rev[j]=arr[i];
            j++;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(rev[i]+" ");
        }
        System.out.println();
//        second Largest
        int secondLargest=arr[0];;
        int largest=arr[0];
        for(int i=0;i<arr.length;i++){
            if(largest<arr[i]){
                largest=arr[i];
            }
            if(arr[i]<largest&&arr[i]>=secondLargest){
                secondLargest=arr[i];
            }
        }
        System.out.println("second largest element is = "+secondLargest);
//        check if array is sorted
        boolean isSorted=true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]) {
                isSorted = false;
                break;
            }
            }
            if(isSorted==true){
                System.out.println("Array is  sorted");

            }
            else{
                System.out.println("Array is not sorted");

            }
    }
}
