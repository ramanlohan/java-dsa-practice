package Love_Babbar_questions.two;

import java.util.Scanner;

public class lowerCaseToUpperCase {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        char one=sc.next().charAt(0);
        System.out.println((char)(one-32));
    }
}
