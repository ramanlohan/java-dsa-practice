package LogicBuilding.Phase1WhileLoop;

import java.util.Scanner;

public class ReverseTheGivenNumberAndPrintTheReversedValue {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int rev=0;
        while(n>=1){
            rev=(n%10)+rev*10;
            n=n/10;
        }
        System.out.println(rev);
    }
}
