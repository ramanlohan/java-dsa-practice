package LogicBuilding.Phase2DoWhileLoop;

import java.util.Scanner;

public class FindTheHCFOfTheGivenNumbers {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int big=0;
        int small=0;
        if(a>b){
            big=a;
            small=b;
        }
        else{
            big=b;
            small=a;
        }
        int rem;
        do{
             rem=big%small;
            big=small;
            small=rem;
        }
        while(rem!=0);
        System.out.println(big);
    }
}