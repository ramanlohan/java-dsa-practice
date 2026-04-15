package LogicBuilding.Phase4NestedLoopLogic;

import java.util.Scanner;

public class PrintAllPossiblePairs_i_j_WhereBothiAndjRangeFrom1ToN {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.println("("+i+","+j+")");
            }
        }
    }
}
