package LoveBabbarQuestions.Patterns;

import java.util.Scanner;

public class Pattern12 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int k=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            System.out.print("*");
            if(i>1) {
                for (int j = 1; j <= k; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }

            System.out.println();
            k+=2;
        }
    }
}
