package Dsa.Basics.Patterns;

import java.util.Scanner;

public class Pattern19 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=0;
        int l=(2*n)-2;
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print("*");
            }
            for(int j=1;j<=k;j++){
                System.out.print(" ");
            }
            for(int j=n;j>=i;j--){
                System.out.print("*");
            }
            k+=2;
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=l;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            l-=2;
            System.out.println();
        }
    }
}
