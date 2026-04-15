package LogicBuilding.Phase2DoWhileLoop;

import java.util.Scanner;

public class CheckWhetherTheGivenNumberIsANumberIsPalindrome {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int rev=0;
        do{
            rev=(n%10)+rev*10;
            n=n/10;
        }
        while(n>0);
        if(rev==temp){
            System.out.println("it's palindrome");
        }
        else{
            System.out.println("it's not palindrome");
        }
    }
}
