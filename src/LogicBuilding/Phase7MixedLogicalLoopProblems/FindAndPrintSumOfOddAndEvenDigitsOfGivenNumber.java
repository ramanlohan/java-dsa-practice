package LogicBuilding.Phase7MixedLogicalLoopProblems;

import java.util.Scanner;

public class FindAndPrintSumOfOddAndEvenDigitsOfGivenNumber {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int temp=n;
        int sumEven=0;
        int sumOdd=0;
        while(temp>0){
            int digit=temp%10;
            if(digit%2==0){
                sumEven+=digit;
            }
            else{
                sumOdd+=digit;
            }
            temp/=10;
        }
        System.out.println("sum of even digitsn is = "+sumEven+" sum of odd digits is = "+sumOdd);
    }
}
