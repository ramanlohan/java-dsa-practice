package Dsa.Basics;

import java.util.Scanner;

public class MinimumNumberOfOnes {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a = 11, b = 22, c;
        c = a + b + a++ + b++ + ++a + ++b;
        System.out.println("c=" + c);

    }
}
