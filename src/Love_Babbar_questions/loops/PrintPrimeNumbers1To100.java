package Love_Babbar_questions.loops;

import java.util.Scanner;

public class PrintPrimeNumbers1To100 {
    public static boolean isPrime(int number){
        boolean isPrime=true;
        for(int i=2;i<number;i++){
            if(number%i==0){
                isPrime=false;
            }
        }
        return isPrime;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        for(int i=2;i<=100;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }

}
