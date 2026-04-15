package LogicBuilding.Phase2DoWhileLoop;

import java.util.Scanner;

public class KeepTakingNumbersFromTheUserUntilANegativeNumberIsEnteredThenCountHowManyPositiveNumbersWereEntered {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n;
        int count=0;
        do{
            n=sc.nextInt();
            if(n>=0){
                count++;
            }
            else{
                break;
            }
        }
        while(true);
        System.out.println(count);
    }
}
