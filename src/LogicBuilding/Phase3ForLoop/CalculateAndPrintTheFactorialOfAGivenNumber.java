package LogicBuilding.Phase3ForLoop;

import java.util.Scanner;

public class CalculateAndPrintTheFactorialOfAGivenNumber {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=1;
        for(int i=n;i>1;i--){
            sum*=i;
        }
        System.out.println(sum);
    }
}
