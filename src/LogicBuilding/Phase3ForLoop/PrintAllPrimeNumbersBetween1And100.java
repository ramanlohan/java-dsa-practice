package LogicBuilding.Phase3ForLoop;

public class PrintAllPrimeNumbersBetween1And100 {
    public static void main(String[]args){
        PrintAllPrimeNumbersBetween1And100 obj=new PrintAllPrimeNumbersBetween1And100();
        for(int i=2;i<=100;i++){
            obj.prime(i);
        }
    }
    public  void prime(int num){
        boolean isPrime=true;
        for(int i=2;i<num;i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
            if(isPrime){
                System.out.println(num+" ");
            }
    }
}
