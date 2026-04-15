package LogicBuilding.Phase5Break_ContinueLogic;

import java.util.Scanner;

public class ContinuouslyAddNumbersUntilSumBecomesGreaterThan100 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int sum=0;
        while(true){
            int n =sc.nextInt();
            sum+=n;
            if(sum>100){
                break;
            }
        }
        System.out.println(sum);
    }
}
