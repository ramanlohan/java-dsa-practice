package LogicBuilding.Phase1WhileLoop;

import java.util.Scanner;

public class CalculateTheSumOfAllOddNumbersFrom1ToN {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int odd=1;
        int sum=0;
        int n=sc.nextInt();
        while(odd<=n){
            sum+=odd;
            odd+=2;
        }
        System.out.println(sum);
    }
}
