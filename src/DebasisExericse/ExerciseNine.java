package DebasisExericse;
import java.util.Scanner;
public class ExerciseNine {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        String s = sc.nextLine();
        String ss ="";
        for(int i=s.length()-1;i>=0;i--){
            ss = ss+s.charAt(i);


        }
        System.out.println(ss);
    }
}
