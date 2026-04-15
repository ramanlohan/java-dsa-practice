package Love_Babbar_questions.loops;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPalindrome=true;
        for(int i =2;i<n;i++){
            if(n%i==0){
                isPalindrome=false;
            }
        }
        if(isPalindrome){
            System.out.println("it is palindrome");
        }
        else{
            System.out.println("it is not palindrome");
        }
    }
}
