package LoveBabbarQuestions.one;

import java.util.Scanner;

public class Three_FindAndPrintSimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal amount");
        double principal=sc.nextDouble();
        System.out.println("Enter the rate of interest ");
        double interest= sc.nextDouble();
        System.out.println("Enter the time ");
        int time= sc.nextInt();
        System.out.println("Simple interest is = "+((principal*interest*time)/100));
    }
}
