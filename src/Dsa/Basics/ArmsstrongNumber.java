package Dsa.Basics;

import java.util.Scanner;

public class ArmsstrongNumber {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int check=n;
        int sum;
        int sumone=0;
        while(n>0){
            sum=n%10;
            sumone+=(sum*sum*sum);
            n=n/10;
        }
        if(check==sumone){
            System.out.println("it's a armstrong number");
        }
        else{
            System.out.println("it's not a armstrong number");
        }
    }
}
