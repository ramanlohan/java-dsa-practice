package LogicBuilding.Phase1WhileLoop;

import java.util.Scanner;

public class PrintAllNumbersBetweenAAndBThatAreDivisibleBy7 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int temp=0;
        if(a>=b){
            temp=b;
            while(temp<=a){
                if(temp%7==0){
                    System.out.println(temp);
                }
                temp++;
            }
        }
        else{
            temp=a;
            while(temp<=b){
                if(temp%7==0){
                    System.out.println(temp);
                }
                temp++;
            }
        }
    }
}
