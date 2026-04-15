package LogicBuilding.Phase1WhileLoop;

import java.util.Scanner;

public class CheckWhetherTheGivenNumberIsAPalindrome {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int temp=n;
        int rev=0;
        while(temp>=1){
            rev=(temp%10)+rev*10;
            temp=temp/10;
        }
        if(rev==n){
            System.out.println("it's a palindrome");
        }
        else{
            System.out.println("it's not a palindrome");
        }
    }
}
