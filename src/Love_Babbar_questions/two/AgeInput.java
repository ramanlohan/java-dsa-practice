package Love_Babbar_questions.two;

import java.util.Scanner;

public class AgeInput {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int age=sc.nextInt();
        if(age<0){
            System.out.println("age is invalid");
        }
        else if(age>=0&&age<18){
            System.out.println("not eligigble");
        }
        else{
            System.out.println("elgible");
        }
    }
}
