package LogicBuilding.Phase3ForLoop;

import java.util.Scanner;

public class FindAndPrintTheSumOfAllOddNumbersFrom1UpToN {public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int n = sc.nextInt();
    for(int i=1;i<=n;i++){
        if(i%2!=0){
            System.out.println(i);
        }
    }
}
}
