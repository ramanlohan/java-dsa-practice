package LogicBuilding.Phase3ForLoop;

public class PrintAllEvenNumbersBetween1And100 {
    public static void main(String[]args){
        for(int i=2;i<=100;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}
