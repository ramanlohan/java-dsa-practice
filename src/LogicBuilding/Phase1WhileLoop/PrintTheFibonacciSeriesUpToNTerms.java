package LogicBuilding.Phase1WhileLoop;

import java.util.Scanner;

public class PrintTheFibonacciSeriesUpToNTerms {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int fT=0;
        int sT=1;
        int i=0;
        while(i<=n){
            System.out.println(fT);
            int nT=fT+sT;
            fT=sT;
            sT=nT;
            i++;
        }
    }
}
