package LogicBuilding.Phase7MixedLogicalLoopProblems;

public class PrintNumbersFrom1To100WithDigitSumMultipleOf3 {
    public static void main(String[]args){
        for(int i=1;i<=100;i++){
            int sum=0;
            int temp=i;
            while(temp>0){
                sum+=temp%10;
                temp=temp/10;
            }
            if(sum%3==0){
                System.out.println(i);
            }
        }
    }
}
