package LogicBuilding.Phase3ForLoop;

import java.util.Scanner;

public class PrintAllNumbersBetweenAAndBThatAreDivisibleBy7 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int big;
        int small;
        if (a > b) {

            big=a;
            small=b;
        }
        else{
            big=b;
            small=a;
        }
        for(int i=small;i<=big;i++){
            if(i%7==0){
                System.out.println(i);
            }

        }
    }
}
