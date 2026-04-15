package LogicBuilding.Phase1WhileLoop;

import java.util.Scanner;

public class CountAndPrintTheTotalNumberOfDigitsInAGivenNumber {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=0;
        while(n>=1){
            n=(n-n%10)/10;
            count++;
        }
        System.out.println("number of digits are = "+count);
    }
}
