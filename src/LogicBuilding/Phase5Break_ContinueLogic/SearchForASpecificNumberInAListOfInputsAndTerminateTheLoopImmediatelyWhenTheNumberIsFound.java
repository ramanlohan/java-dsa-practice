package LogicBuilding.Phase5Break_ContinueLogic;

import java.util.Scanner;

public class SearchForASpecificNumberInAListOfInputsAndTerminateTheLoopImmediatelyWhenTheNumberIsFound {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a target number");
        int n = sc.nextInt();
        while(true){
            int num=sc.nextInt();
            if(num==n){
                System.out.println("number matched");
                break;
            }
        }
    }
}
