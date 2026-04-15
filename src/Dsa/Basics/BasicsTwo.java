package Dsa.Basics;

import java.util.Scanner;

public class BasicsTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        int sum2=0;
        for(int n =20;n<=40;n++){

            if(n%2==0){
                sum =sum +n;
            }


        }
        System.out.println(sum);
        for(int n =1;n<=10;n++){
            if(n%2==0){
                sum2 =sum2 +n;
            }
        }
        System.out.println(sum2);
    }
}
