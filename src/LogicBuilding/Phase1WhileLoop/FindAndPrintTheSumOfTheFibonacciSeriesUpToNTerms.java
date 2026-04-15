package LogicBuilding.Phase1WhileLoop;

import java.util.Scanner;

public class FindAndPrintTheSumOfTheFibonacciSeriesUpToNTerms {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int fT=0;
        int sT=1;
        int i=0;
        int sum=0;
        while(i<n){
            sum+=fT;
            int nT=fT+sT;
            fT=sT;
            sT=nT;
            i++;
        }
        System.out.println(sum);
    }
}
