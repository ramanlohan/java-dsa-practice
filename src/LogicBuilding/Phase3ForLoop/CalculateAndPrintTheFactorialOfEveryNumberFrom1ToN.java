package LogicBuilding.Phase3ForLoop;

import java.util.Scanner;

public class CalculateAndPrintTheFactorialOfEveryNumberFrom1ToN {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            long sum=1;
            for(int j=i;j>=1;j--){
                sum*=j;
            }
            System.out.println(sum);
        }
    }
}
