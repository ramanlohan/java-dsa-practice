package DebasisExericse;
import java.util.Scanner;
public class ExerciseEleven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int j = sc.nextInt();
        for (int i = 1; i <= j; i++) {
            int l = i;
            System.out.println();
            while (true) {
                if(l<=0){break;
                }
                System.out.print(i);
                l--;

            }
        }
    }
}