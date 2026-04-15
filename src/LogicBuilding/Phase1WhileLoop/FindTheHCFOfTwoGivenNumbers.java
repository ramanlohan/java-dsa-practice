package LogicBuilding.Phase1WhileLoop;

import java.util.Scanner;

public class FindTheHCFOfTwoGivenNumbers {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int i=1;
        int big=0;
        int small=0;
        int result=0;
        if(a>=b){
            big=a;
            small=b;
        }
        if(a<b){
            big=b;
            small=a;
        }
        while(i<=big){
            if(big%i==0&&small%i==0){
                result=i;
            }
            i++;
        }
        System.out.println(result);
    }
}
