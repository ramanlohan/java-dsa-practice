package Dsa.Basics;

import java.util.Scanner;

public class GreatestCommonDivisor {
        public static void main(String[]args){
            Scanner sc= new Scanner(System.in);
            int n1= sc.nextInt();
            int n2=sc.nextInt();
            if(n1 == 0) {
                System.out.println(n2);
                return;
            }
            if(n2 == 0) {
                System.out.println(n1);
                return;
            }
            int temp=n1;
            if(temp>n2){
                temp=n2;
            }
            int divisor=0;
            for(int i=0;i<=temp;i++){
                if(n1%i==0&&n2%i==0){
                    divisor=i;
                }
            }
            System.out.println(divisor);
        }

}
