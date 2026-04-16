package LogicBuilding.Phase7MixedLogicalLoopProblems;



public class PrintAllNumbersBetween1And100WhoseSumOfDigitsIsEven {
    public static void main(String[]args){
        int sum;
        int digits;
        int temp;
        for(int i=1;i<=100;i++){
            sum=0;
             temp=i;
            while(temp>0){
                digits=temp%10;
                temp=temp/10;
                sum+=digits;
            }
            if(sum%2==0){
                System.out.println(i);
            }
        }
    }
}
