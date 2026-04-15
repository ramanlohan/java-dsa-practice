package LogicBuilding.Phase1WhileLoop;

import java.util.Scanner;

public class FindTheLCMOfTwoGivenNumbers {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a1=sc.nextInt();
        int a2=sc.nextInt();
        int rem=0;
        int big=0;
        int small=0;
        if(a1>a2){
            big=a1;
            small=a2;
        }
        else{
            big=a2;
            small=a1;
        }
        while(big%small!=0){
            rem=big%small;
            big=small;
            small=rem;
        }
        System.out.println(big+" "+small+" "+rem);
        int gcd=small;
        int lcm=(a1*a2)/gcd;
        System.out.println("HCF/GCD of both numbers is = "+gcd+" and lcm of both numbers is "+lcm);

    }
}
