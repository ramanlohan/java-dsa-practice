package LogicBuilding.Phase1WhileLoop;



public class PrintAllPrimeNumbersBetween1And100 {
    public static void main(String[]args){
        int n=1;
        int newe=2;
        boolean isPrime=true;
        while(n<100){
            int i=2;
            isPrime=true;
            while(i<newe){
                if(newe%i==0){
                    isPrime=false;
                    newe++;
                    break;
                }
                else{
                    i++;
                }
            }
            if(isPrime){
                System.out.println(newe);
                newe++;
            }
            n++;
        }

    }
}
