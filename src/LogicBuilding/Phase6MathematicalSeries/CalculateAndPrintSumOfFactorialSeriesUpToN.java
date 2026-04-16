package LogicBuilding.Phase6MathematicalSeries;

import java.util.Scanner;

public class CalculateAndPrintSumOfFactorialSeriesUpToN {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int sum2=0;
        for(int i=1;i<=n;i++){
            int sum1=1;
            for(int j=i;j>=1;j--){
                sum1*=j;
            }
            sum2+=sum1;
        }
        System.out.println(sum2);
    }
}
