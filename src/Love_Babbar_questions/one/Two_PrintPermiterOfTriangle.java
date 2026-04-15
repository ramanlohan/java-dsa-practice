package Love_Babbar_questions.one;

import java.util.Scanner;

public class Two_PrintPermiterOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter all 3 sides of a triangle");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println("perimeter of traingle is = "+(a+b+c));
    }
}