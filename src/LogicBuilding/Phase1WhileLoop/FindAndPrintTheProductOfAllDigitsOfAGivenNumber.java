package LogicBuilding.Phase1WhileLoop;

import java.util.Scanner;

public class FindAndPrintTheProductOfAllDigitsOfAGivenNumber {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=1;
        int count=0;
        while(n>=1){
            if(n%10>0){
                sum*=n%10;
            }
            n=(n-n%10)/10;
            count++;
        }
        System.out.println(sum);
        System.out.println("number of digits are = "+count);
    }
}
