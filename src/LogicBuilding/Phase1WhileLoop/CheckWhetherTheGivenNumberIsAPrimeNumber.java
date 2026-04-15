package LogicBuilding.Phase1WhileLoop;

import java.util.Scanner;

public class CheckWhetherTheGivenNumberIsAPrimeNumber {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPrime=true;
        if(n<=1){
            System.out.println("give numbers bigger than 1 to check prime");
        }

        else{
            int i=2;
            while(i<n){
                if(n%i==0){
                    isPrime=false;
                    break;
                }
                i++;
            }
            if(isPrime){
                System.out.println("it's prime");
            }
            else{
                System.out.println("it's not prime");
            }
        }
    }
}
