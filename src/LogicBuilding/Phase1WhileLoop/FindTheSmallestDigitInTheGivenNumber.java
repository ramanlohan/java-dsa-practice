package LogicBuilding.Phase1WhileLoop;

import java.util.Scanner;

public class FindTheSmallestDigitInTheGivenNumber {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int temp1=a%10;
        int temp2;
        while(a>0){
            temp2=a%10;

            if(temp1>temp2){
                temp1=temp2;
            }
            a=a/10;
        }
        System.out.println(temp1);

    }
}
