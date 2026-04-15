package LogicBuilding.Phase5Break_ContinueLogic;

public class PrintNumbersFrom1To100AndStopTheLoopAsSoonAsANumberDivisibleBy17IsEncountered {
    public static void main(String[]args){
        for(int i=1;i<=100;i++){
            if(i%17==0){
                break;
            }
            System.out.println(i);
        }
    }
}
