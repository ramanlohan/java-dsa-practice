package LogicBuilding.Phase6MathematicalSeries;

import java.util.Scanner;

public class PrintFibonacciSeriesUpToTheRequiredNumberOfTerms {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int fT=0;
        int sT=1;
        for(int i =0;i<=n;i++){
            System.out.println(fT);
            int nT=sT+fT;
            fT=sT;
            sT=nT;
        }
    }
}
