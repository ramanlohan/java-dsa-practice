package LogicBuilding.Phase1WhileLoop;

import java.util.Scanner;

public class CheckWhetherTheGivenNumberIsAnPerfectNumber {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int temp=n-1;
        int sum=0;
        while(temp>0){
            if(n%temp==0){
                sum+=temp;
            }
            temp--;
        }
        if(sum==n){
            System.out.println("it's a perfect number");
        }
        else{
            System.out.println("it's not a perfect number");
        }
    }
}
