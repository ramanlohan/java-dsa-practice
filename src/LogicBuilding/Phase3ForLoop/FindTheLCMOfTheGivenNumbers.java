package LogicBuilding.Phase3ForLoop;

import java.util.Scanner;

public class FindTheLCMOfTheGivenNumbers {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int big;
        int small;
        if(a>b){
            big=a;
            small=b;
        }
        else{
            big=b;
            small=a;
        }
        for(;small!=0;){
            int rem=big%small;
            big=small;
            small=rem;
        }
        int lcm=(a*b)/big;
        System.out.println(lcm);
    }
}
