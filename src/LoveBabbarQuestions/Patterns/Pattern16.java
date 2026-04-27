package LoveBabbarQuestions.Patterns;

import java.util.Scanner;

public class Pattern16 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print((char)('A'+j));
                if(j<i-1){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
