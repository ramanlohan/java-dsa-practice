package LogicBuilding.Phase3ForLoop;

import java.util.Scanner;

public class FindAndPrintTheSumOfTheFibonacciSeries {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int fT=0;
        int sT=1;
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=fT;
            int nT=sT+fT;
            fT=sT;
            sT=nT;
        }
        System.out.println(sum);
    }
}
