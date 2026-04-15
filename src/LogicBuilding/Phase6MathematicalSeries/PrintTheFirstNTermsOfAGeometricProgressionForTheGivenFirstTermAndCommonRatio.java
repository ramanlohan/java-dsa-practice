package LogicBuilding.Phase6MathematicalSeries;

import java.util.Scanner;

public class PrintTheFirstNTermsOfAGeometricProgressionForTheGivenFirstTermAndCommonRatio {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("give first term");
        int fT=sc.nextInt();
        System.out.println("give common ratio");
        int cR=sc.nextInt();
        System.out.println("number till where you want to get gp printed");
        int n =sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println(fT);
            fT*=cR;
        }
    }
}
