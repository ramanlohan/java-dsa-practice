package LogicBuilding.Phase2DoWhileLoop;

import java.util.Scanner;

public class KeepTakingNumbersFromTheUserUntil0IsEnteredThenPrintTheSumOfAllEnteredNumbers {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int n;
        int sum = 0;
        do{
             n=sc.nextInt();
            sum+=n;
        }
        while(n!=0);
        System.out.println(sum);
    }
}
