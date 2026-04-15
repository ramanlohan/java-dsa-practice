package LogicBuilding.Phase2DoWhileLoop;

import java.util.Scanner;

public class FindAndPrintTheSumOfDigitsOfTheGivenNumber {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        do{
            sum+=n%10;
            n=n/10;
        }
        while(n>0);
        System.out.println(sum);
    }
}
