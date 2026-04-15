package DebasisExericse;

import java.util.Scanner;

public class ExerciseFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i=sc.nextInt();
        int max=i;
        int min=i;
        while (i>0){
            i=sc.nextInt();
              if(i<0){
                break;
            }
            else if(i>max){
                max=i;
            }
            else if(i<min){
                min=i;

            }

        }
        System.out.println("max is"+max);
        System.out.println("min is "+min);




    }
}
