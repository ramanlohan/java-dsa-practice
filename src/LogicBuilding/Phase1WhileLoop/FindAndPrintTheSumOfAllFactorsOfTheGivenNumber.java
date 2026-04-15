package LogicBuilding.Phase1WhileLoop;

import java.util.Scanner;

public class FindAndPrintTheSumOfAllFactorsOfTheGivenNumber {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int i=1;
        int sum=0;
        while(i<=n){
            if(n%i==0){
                sum+=i;
            }
            i++;
        }
        System.out.println(sum);
    }
}
