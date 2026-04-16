package LogicBuilding.Phase7MixedLogicalLoopProblems;

import java.util.Scanner;

public class PrintAllNumbersFrom1ToNWhoseBinaryRepresentationContainsAnEvenNumberOf1s {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int count;
        for(int i=1;i<=n;i++){
            int temp=i;
            count=0;
            while(temp>0){
                if(temp%2!=0){
                    count++;
                }
                temp=temp/2;
            }
            if(count%2==0){
                System.out.println(i);
            }
        }
    }
}
