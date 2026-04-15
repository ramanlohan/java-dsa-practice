package LogicBuilding.Phase2DoWhileLoop;

import java.util.Scanner;

public class PrintTheFibonacciSeriesUpToTheRequiredNumberOfTerms {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int fT=0;
        int sT=1;
        do{
            System.out.println(fT);
            int nT=fT+sT;
            fT=sT;
            sT=nT;
            n--;
        }
        while(n>0);

    }
}
