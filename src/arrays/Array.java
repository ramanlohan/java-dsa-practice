package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int[][] one = {{0,3,4},{1,2,3},{6,5,7}};
       printArray(getArray());

    }
    public static void printArray(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
    public static int[][] getArray(){
        int[][] one = {{0,3,4},{1,2,3},{6,5,7}};
        return one;
    }
}
