package Love_Babbar_questions.two;

import java.util.Scanner;

public class FiveSubjectAverage {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("do you want your percentage to be calculated enter 1 for yes 0 for no");
        int n = sc.nextInt();
        if(n==1){
            System.out.println("lets start baby");
            System.out.println("enter maths marks");
            int maths=sc.nextInt();
            System.out.println("enter science marks");
            int science=sc.nextInt();
            System.out.println("enter hindi marks");
            int hindi=sc.nextInt();
            System.out.println("enter english marks");
            int english=sc.nextInt();
            System.out.println("enter ss marks");
            int ss=sc.nextInt();
            double percentage=(((maths+science+hindi+english+ss)/500.0)*100);
            System.out.println("your percentage is = "+percentage);

        }
        else if(n==0){
            System.out.println("thats not good anchal");
        }
        else {
            System.out.println("number shi daal le");
        }
    }
}
