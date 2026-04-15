package LogicBuilding.Phase1WhileLoop;

import java.util.Scanner;

public class CalculateTheSumOfAllEvenNumbersFrom1ToN {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int even=2;
        int sum=0;
        int n=sc.nextInt();
        while(even<=n){
            sum+=even;
            even+=2;
        }
        System.out.println(sum);
    }
}
