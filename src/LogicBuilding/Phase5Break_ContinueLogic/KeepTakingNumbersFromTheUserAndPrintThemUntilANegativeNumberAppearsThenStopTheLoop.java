package LogicBuilding.Phase5Break_ContinueLogic;

import java.util.Scanner;

public class KeepTakingNumbersFromTheUserAndPrintThemUntilANegativeNumberAppearsThenStopTheLoop {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        while(true){
            int n =sc.nextInt();
            if(n<0){
                break;
            }
            System.out.println(n);
        }
    }
}
