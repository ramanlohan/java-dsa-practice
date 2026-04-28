package LoveBabbarQuestions.ClassOne;

import java.util.Scanner;

public class Five_PrintCountingFromNTo1 {
    public static void main(String[] args) {
        Scanner scc = new Scanner(System.in);
        int n=scc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println(i);
        }
    }
}