package LogicBuilding.Phase2DoWhileLoop;

import java.util.Scanner;

public class CheckWhetherTheGivenNumberIsAnArmstrongNumber {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        int digits=0;
        int digitsCopy;
        int temp=num;
        int sum;
        int temp2=0;
        do{
            digits++;
            temp=temp/10;
        }
        while(temp>0);
        digitsCopy=digits;
        temp=num;
        do{
            int i=temp%10;
            sum=1;
            do{
                sum*=i;
                digits--;
            }
            while(digits>=1);
            digits=digitsCopy;
            temp2+=sum;
            temp=temp/10;
        }
        while(temp>0);
        if(temp2==num){
            System.out.println("armsstrong");
        }
        else{
            System.out.println("not armsstrong");
        }
    }
}
