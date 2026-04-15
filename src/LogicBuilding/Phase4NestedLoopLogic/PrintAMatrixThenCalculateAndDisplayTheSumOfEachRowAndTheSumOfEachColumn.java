package LogicBuilding.Phase4NestedLoopLogic;

import java.util.Scanner;

public class PrintAMatrixThenCalculateAndDisplayTheSumOfEachRowAndTheSumOfEachColumn {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int rowN=sc.nextInt();
        int columnN=sc.nextInt();
        int column;
        int row;
        int rowSum;
        int columnSum=0;
        for(int i=1;i<=rowN;i++){
            for(int j=1;j<=columnN;j++){
                 column=sc.nextInt();
                 columnSum+=column;
            }
            System.out.println("Sum of column 1 is = "+columnSum);
        }
    }
}
