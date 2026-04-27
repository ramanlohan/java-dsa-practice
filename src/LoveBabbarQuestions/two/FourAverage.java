package LoveBabbarQuestions.two;

import java.util.Scanner;

public class FourAverage {
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
            int min = maths;

            if (science < min) min = science;
            if (english < min) min = english;
            if (hindi < min) min = hindi;
            if (ss < min) min = ss;
            int total=maths+english+hindi+ss+science-min;
            double percentage=((total/400.0)*100);
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
