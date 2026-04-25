package Dsa.Basics;

import java.util.Scanner;

public class Exponetiation {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("give number");
        int x=sc.nextInt();
        System.out.println("give power");
        int n = sc.nextInt();
        int ans=1;
        while(n>0){
            if(n%2==1){
                ans*=x;
                n=n-1;
            }
            else{
                n=n/2;
                x*=x;
            }
        }
        System.out.println(ans);
    }
}
