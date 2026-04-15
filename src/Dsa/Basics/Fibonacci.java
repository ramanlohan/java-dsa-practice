package Dsa.Basics;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int one=0;
        int second=1;
        int third=one+second;
        for(int i=1;i<n;i++){
            third=one+second;
            one=second;
            second=third;
        }
        System.out.println(third);
    }
}
