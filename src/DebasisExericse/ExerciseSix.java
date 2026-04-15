package DebasisExericse;
import java.util.Scanner;
public class ExerciseSix {
    public static void main (String[] args){
        Scanner sc= new Scanner(System.in);

        int sum = 0;

        for(int n=sc.nextInt();n>0;n=n/10){
            sum+=n%10;
        }
        System.out.println(sum);
        int n =sc.nextInt();
        while(n>0){
            sum+=n%10;
            n=n/10;
        }
        System.out.println(sum);
    }
}
