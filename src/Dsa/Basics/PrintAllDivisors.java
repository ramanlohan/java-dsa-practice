package Dsa.Basics;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintAllDivisors {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                arr.add(i);
            }
        }
        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }
    }
}
