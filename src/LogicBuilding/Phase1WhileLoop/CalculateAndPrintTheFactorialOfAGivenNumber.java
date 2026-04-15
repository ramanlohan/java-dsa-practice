package LogicBuilding.Phase1WhileLoop;

import java.util.Scanner;

public class CalculateAndPrintTheFactorialOfAGivenNumber {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int sum=1;
        while(n>=1){
            sum*=n;
            System.out.println(sum);
            n--;
        }
        System.out.println(sum);
    }
}
