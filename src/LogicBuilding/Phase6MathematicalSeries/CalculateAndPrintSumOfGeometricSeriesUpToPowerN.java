package LogicBuilding.Phase6MathematicalSeries;

import java.util.Scanner;

public class CalculateAndPrintSumOfGeometricSeriesUpToPowerN {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int x =sc.nextInt();
        int term=1;
        int sum=0;
        for(int i=0;i<=n;i++){
            sum+=term;
            term*=x;
        }
        System.out.println(sum);

    }
}
