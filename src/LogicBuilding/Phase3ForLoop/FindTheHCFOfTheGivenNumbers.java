package LogicBuilding.Phase3ForLoop;

import java.util.Scanner;

public class FindTheHCFOfTheGivenNumbers {
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
        for(int i=1;small!=0;i++){
            int rem=big%small;
            big=small;
            small=rem;
        }
        System.out.println(big);
    }
}
