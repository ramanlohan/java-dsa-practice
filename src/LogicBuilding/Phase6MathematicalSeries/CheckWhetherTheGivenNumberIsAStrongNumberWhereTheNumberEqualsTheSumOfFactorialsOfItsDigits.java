package LogicBuilding.Phase6MathematicalSeries;

import java.util.Scanner;

public class CheckWhetherTheGivenNumberIsAStrongNumberWhereTheNumberEqualsTheSumOfFactorialsOfItsDigits {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int sum=0;
        for(;temp>0;temp=temp/10){
            int factorial=1;
            int digit=temp%10;
            for(int j=digit;j>=1;j-- ){
                factorial*=j;
            }
            sum+=factorial;
        }
        System.out.println(sum);
        if(sum==n){
            System.out.println("it's Strong a number");
        }
        else{
            System.out.println("it's not Strong a number");
        }
    }
}
