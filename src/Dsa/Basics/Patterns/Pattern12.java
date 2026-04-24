package Dsa.Basics.Patterns;

import java.util.Scanner;

public class Pattern12 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int k=(2*n)-2;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int j=1;j<=k;j++){
                System.out.print(" ");

            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
            k-=2;
        }
    }
}
