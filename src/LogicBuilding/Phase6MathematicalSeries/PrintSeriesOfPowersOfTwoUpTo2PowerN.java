package LogicBuilding.Phase6MathematicalSeries;

import java.util.Scanner;

public class PrintSeriesOfPowersOfTwoUpTo2PowerN {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int term=1;
        for(int i=1;i<=n;i++){
            System.out.println(term);
            term*=2;
        }

    }
}
