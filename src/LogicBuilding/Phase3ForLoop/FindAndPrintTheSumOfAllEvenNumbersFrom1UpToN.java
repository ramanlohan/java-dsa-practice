package LogicBuilding.Phase3ForLoop;

import java.util.Scanner;

public class FindAndPrintTheSumOfAllEvenNumbersFrom1UpToN {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=2;i<=n;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}
