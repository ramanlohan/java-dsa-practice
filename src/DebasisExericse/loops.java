package DebasisExericse;

public class loops {
    public static void main(String[]args){
        int n=18;
        {
            boolean isPrime=true;
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    System.out.println("it's not prime");
                    isPrime=false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println("it's prime");
            }
            else{
                System.out.println("it's not prime");
            }
        }

//        int sum=0;
//        for(int i=1;i<=n/2;i++){
//            if(n%i==0){
//                sum=sum+i;
//
//            }
//        }
//        if(sum>1){
//            System.out.println("it's not prime");
//        }
//        else{
//            System.out.println("it's  prime");
//        }
//        System.out.println(sum);
    }
}
