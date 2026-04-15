package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class arraylisttwo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ii=new ArrayList<>();
        System.out.println("enter number of elements you want to enter");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int temp = sc.nextInt();
            if(!ii.contains(temp)) {
                ii.add(temp);
            }
        }
        Collections.sort(ii);
        System.out.println(ii);
        for (int i:ii){
            System.out.println(i+" ");
        }
    }
}
