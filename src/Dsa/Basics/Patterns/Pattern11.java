package Dsa.Basics.Patterns;

import java.util.Scanner;

public class Pattern11 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean num=true;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                num=true;
            }
            else{
                num=false;
            }
            for(int j=1;j<=i;j++){

                System.out.print(num?1:0);
                if(j!=i){
                    System.out.print(" ");
                }
                if(num){
                    num=false;
                }
                else{
                    num=true;
                }

            }
            System.out.println();
        }
    }
}
