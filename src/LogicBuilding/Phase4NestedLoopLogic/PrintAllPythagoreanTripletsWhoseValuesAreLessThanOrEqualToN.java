package LogicBuilding.Phase4NestedLoopLogic;

import java.util.Scanner;

public class PrintAllPythagoreanTripletsWhoseValuesAreLessThanOrEqualToN {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                for(int k=1;k<=n;k++){
                    if((i*i)+(j*j)==(k*k)){
                        System.out.println("("+i+","+j+","+k+")");
                    }
                }
            }
        }
    }
}
