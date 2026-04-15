package LogicBuilding.Phase2DoWhileLoop;

import java.util.Scanner;

public class CreateAMenuDrivenProgramThatAllowsTheUserToChooseAndPerformDifferentOperations {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n ;
        do{
            System.out.println("This is a menu driven program");
            System.out.println("1. Check Even or odd");
            System.out.println("2. sum of digits");
            System.out.println("3. print reverse number");
            System.out.println("4.Exit");
            System.out.println("enter number");
            int m= sc.nextInt();
            System.out.println("choose operation");
            n=sc.nextInt();
            if(n==1){
                if(m%2==0){
                    System.out.println("it's even");
                }
                else{
                    System.out.println("it's odd");

                }
            }
            else if(n==2){
                int sum=0;
                do{
                    sum+=m%10;
                    m=m/10;
                }
                while(m>0);
                System.out.println("sum of digits is = "+sum);
            }
            else if(n==3){
                int rev=0;
                do{
                    rev=(m%10)+rev*10;
                    m=m/10;
                }
                while(m>0);
                System.out.println("reverse number is = "+rev);
            }
            else if(n==4){
                break;
            }
            else {
                System.out.println("enter number between 1 to 4");
            }
        }
        while(n!=0);
    }
}
