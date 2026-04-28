package LoveBabbarQuestions.ClassOne;

import java.util.Scanner;

public class Seven_CheckIfANumberIsPrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPrime=true;
        if(n <= 1){
            isPrime=false;
        }
        else {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if(isPrime){
            System.out.println("your number is Prime");

        }
        else{
            System.out.println("your number is not Prime");
        }

    }
}
