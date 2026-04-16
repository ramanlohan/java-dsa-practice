package LogicBuilding.Phase6MathematicalSeries;

import java.util.Scanner;

public class CalculateAndPrintAlternatingFactorialSeriesWithPowersOfX {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int sum=0;
        for(int i=0;i<=n;i++){
            int factorial=1;
            for(int j=temp%10;j>=1;j--){
                factorial*=temp;
            }
            sum+=factorial;
            temp=temp/10;
        }
        if(sum==n){
            System.out.println("it's Strong a number");
        }
    }
}
