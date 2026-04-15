package Dsa.Basics;

import java.util.Scanner;

public class SevenRings {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long newNumber=0;

        while(t-->0){
            long multiplier=1;
            int n = sc.nextInt();
            int x = sc.nextInt();
            int saveX=x;
            int i =0;
            while(x>0){
                 x=x/10;
                multiplier = multiplier *10;

            }
            newNumber=(n*multiplier)+saveX;
            long any=newNumber;
            long anya=newNumber;
            while(any>0){
                any=any/10;
                i++;
            }
            while(anya>10){
                anya=anya/10;
            }

            if(i==5&&anya!=0){
                System.out.println("yes");
            }
            else{
                System.out.println("no");
            }
        }
    }
}
