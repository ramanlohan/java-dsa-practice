package DebasisExericse;

import java.util.Scanner;

public class ExerciseTwelve {
    public static void main (String[]args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int k = 1;k <=i ;k++){
                    System.out.print("*");
            }
            System.out.println();
        }
System.out.println("change");

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++) {
                System.out.print(" ");
            }
            for(int k=1;k<=(i*2)-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
