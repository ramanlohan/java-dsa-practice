package LogicBuilding.Phase4NestedLoopLogic;

import java.util.Scanner;

public class ForEveryNumberFrom1ToNCountAndPrintTheTotaNlumberftsactors {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int count;
        for(int i=1;i<=n;i++){
            count=0;
            System.out.println("factors of "+i+" are");
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    System.out.print(j+"  ");
                    count++;
                }
            }
            System.out.println();
            System.out.println("number of factors of "+i+" are = "+count);
        }
    }
}
