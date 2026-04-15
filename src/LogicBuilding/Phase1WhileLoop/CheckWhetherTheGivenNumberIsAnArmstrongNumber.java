package LogicBuilding.Phase1WhileLoop;

import java.util.Scanner;

public class CheckWhetherTheGivenNumberIsAnArmstrongNumber {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        int sum=0;
        int power=1;
        int temp=n;
        int single=0;
        while(temp>=1){
            temp=temp/10;
            count++;
        }
        temp=n;
        while(temp>=1){
            single=temp%10;
            int co=1;
            power=1;
            while(co<=count){
                    power *= single;
                    co++;
            }
            sum+=power;
            temp=temp/10;
        }
        if(sum==n){
            System.out.println("it's armstrong");
        }
        else{
            System.out.println("it's not armstrong");
        }
    }
}
