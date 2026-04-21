package Dsa.Basics.Patterns;

import java.util.Scanner;

public class Pattern5 {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int j=n;
        int k=n;
        for(int i=1;i<=n;i++){
            for(j=k;j>=1;j--){
                    System.out.print("*");
            }
            k--;
            System.out.println();
        }
    }
}
