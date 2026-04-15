package LogicBuilding.Phase2DoWhileLoop;

import java.util.Scanner;

public class CalculateAndPrintTheSumOfEvenDigitsAndTheSumOfOddDigitsOfTheGivenNumberSeperately {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<0){
            n=-n;
        }
        int even=0;
        int sumEven=0;
        int sumOdd=0;
        int odd=0;
        do{
            if((n%10)%2==0){
                even=(n%10)+even*10;
            }
            else{
                odd=(n%10)+odd*10;
            }
            n=n/10;
        }
        while(n>0);
        do{
            sumEven+=even%10;
            even=even/10;
        }
        while(even>0);
        System.out.println("sum of even digits is = "+sumEven);
        do{
            sumOdd+=odd%10;
            odd=odd/10;
        }
        while(odd>0);
        System.out.println("sum of odd digits is = "+sumOdd);
    }
}
