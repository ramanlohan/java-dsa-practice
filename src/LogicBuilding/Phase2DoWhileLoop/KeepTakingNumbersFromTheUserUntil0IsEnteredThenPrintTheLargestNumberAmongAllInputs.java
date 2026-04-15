package LogicBuilding.Phase2DoWhileLoop;

import java.util.Scanner;

public class KeepTakingNumbersFromTheUserUntil0IsEnteredThenPrintTheLargestNumberAmongAllInputs {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int max=n;
        do{
            n=sc.nextInt();
            if(max<n) {
                max = n;
            }
        }
        while(n!=0);
        System.out.println(max);
    }
}
