package LogicBuilding.Phase1WhileLoop;

import java.util.Scanner;

public class PrintTheMultiplicationTableOfAGivenNumberFromNx1ToNx10 {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int s=sc.nextInt();
        int i=1;
        int m;
        while(i<=10){
            m=s*i;
            System.out.println(s+" * "+i+" = "+m);
            i++;
        }

    }
}
