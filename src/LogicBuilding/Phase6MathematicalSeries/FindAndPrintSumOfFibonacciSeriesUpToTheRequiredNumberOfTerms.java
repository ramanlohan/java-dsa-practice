package LogicBuilding.Phase6MathematicalSeries;

import java.util.Scanner;

public class FindAndPrintSumOfFibonacciSeriesUpToTheRequiredNumberOfTerms {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int sum=0;
        int fT=0;
        int sT=1;
        for(int i =1;i<=n;i++){
            sum+=fT;
            int nT=sT+fT;
            fT=sT;
            sT=nT;
        }
        System.out.println(sum);
    }
}
