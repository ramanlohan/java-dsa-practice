package LoveBabbarQuestions.Arrays;

import java.util.Scanner;

public class DDarray {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int arr[][] = {{52,23,7},{23,4,5,23},{2},{2,3,4,5,2,-2,33,6}};
        for(int i=0;i<=arr.length-1;i++){
            for(int j=0;j<=arr[i].length-1;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
//        to add different column size in different rows
        int ar[][]=new int[3][];
        ar[1]=new int[4];
        ar[0]=new int[3];
        ar[2]=new int[2];
        for(int i=0;i<=ar.length-1;i++){
            for(int j=0;j<=ar[i].length-1;j++){
                ar[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        for(int i=0;i<=ar.length-1;i++){
            for(int j=0;j<=ar[i].length-1;j++){
                System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }
    }
}
