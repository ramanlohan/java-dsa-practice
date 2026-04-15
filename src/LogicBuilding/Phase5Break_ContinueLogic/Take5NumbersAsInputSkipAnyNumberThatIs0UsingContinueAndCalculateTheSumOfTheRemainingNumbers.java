package LogicBuilding.Phase5Break_ContinueLogic;

import java.util.Scanner;

public class Take5NumbersAsInputSkipAnyNumberThatIs0UsingContinueAndCalculateTheSumOfTheRemainingNumbers {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int sum=0;
        for(int i=1;i<=5;i++){
            int n=sc.nextInt();
            if(n==0){
                continue;
            }
            sum+=n;
        }
        System.out.println(sum);
    }
}
