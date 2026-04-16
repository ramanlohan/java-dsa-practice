package LogicBuilding.Phase6MathematicalSeries;

import java.util.Scanner;

public class CalculateAndPrintSumOfHarmonicSeriesUpToN {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        double sum=0;
        for(double i=1;i<=n;i++){
             sum+=1/i;
        }
        System.out.println(sum);
    }
}
