package LoveBabbarQuestions.Patterns;

import java.util.Scanner;

public class Pattern10 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k=1;
        for (int i = 1; i <= n; i++) {
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            if (i == n||i==1) {
                for (int j = 1; j <= (2 * n) - 2; j++) {
                    System.out.print("*");
                }
            }

            if((i > 1 && i < n)){
                for(int j=1;j<=k;j++){
                    System.out.print(" ");
                }
                System.out.print("*");
                k+=2;

            }
            System.out.println();
        }
    }
}