package LogicBuilding.Phase4NestedLoopLogic;

import java.util.Scanner;

public class PrintTheFibonacciPatternRowByRowWhereEachRowPrintsTheNextFibonacciNumbers {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        long ft=0;
        long st=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ft+" ");
                long nt=ft+st;
                ft=st;
                st=nt;
            }
            System.out.println();
        }
    }
}
