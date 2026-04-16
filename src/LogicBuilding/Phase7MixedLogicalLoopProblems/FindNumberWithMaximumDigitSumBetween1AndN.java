package LogicBuilding.Phase7MixedLogicalLoopProblems;

import java.util.Scanner;

public class FindNumberWithMaximumDigitSumBetween1AndN {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int maxSum=0;
        int number=0;
        for(int i =1;i<=n;i++){
            int temp=i;
            int sum=0;
            while(temp>0){
                sum+=temp%10;
                temp=temp/10;
            }
            if(maxSum<sum){
                maxSum=sum;
                number=i;
            }
        }
        System.out.println("number is = "+number+" sum is = "+maxSum);
    }
}
