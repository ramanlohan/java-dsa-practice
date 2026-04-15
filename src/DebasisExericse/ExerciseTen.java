package DebasisExericse;
import java.util.Scanner;
public class ExerciseTen {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
//        String ss="";
//        for(int i=s.length()-1;i>=0;i--){
//            ss+= s.charAt(i);
//        }
//        System.out.println(s+" "+ss);
//        if(ss.equals(s)){
//            System.out.println("it's palindrome");
//        }
//        else{
//            System.out.println("it's not");
        boolean isPalindrome=true;
        for(int i=0,j=s.length()-1;i<j;i++,j--){
            if(s.charAt(i)==(s.charAt(j)))
                continue;
            isPalindrome=false;
            break;
        }
        if(isPalindrome==false){
            System.out.println("it is not a palindrome");
        }
        else{
            System.out.println("it is a Palindrome");
        }
    }
}
