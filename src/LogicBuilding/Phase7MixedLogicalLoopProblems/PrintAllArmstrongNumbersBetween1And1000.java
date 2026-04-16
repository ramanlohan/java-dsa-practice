package LogicBuilding.Phase7MixedLogicalLoopProblems;

public class PrintAllArmstrongNumbersBetween1And1000 {
    public static void main(String[]args){
        int digit;
        for(int i=1;i<=1000;i++){
            int sum;
            int sum2=0;
            int count=0;
            int temp=i;
            int tempc;
            while(temp>0){
                count++;
                temp=temp/10;
            }

            temp=i;
            while(temp>0){
                digit=temp%10;
                sum=1;
                tempc=count;
                while(tempc>0){
                    sum*=digit;
                    tempc--;
                }
                sum2+=sum;
                temp=temp/10;
            }

            if(sum2==i){
                System.out.println(i);
            }
        }
    }
}
