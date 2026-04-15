package arrays;

import java.util.ArrayList;

public class Arraylistt {
    public static void main(String[] args){
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("mango");
        fruits.add("banana");
        fruits.set(1,"apple");
        fruits.add("orange");
        fruits.add("kiwi");
        int[][] arr = {{234,214,524,547,2,53,6345,3},{214,36,36,2435,245,234},{345,25,235,15,456}};
        int[] arr2={5,2,2,0};
        System.out.println(fruits+" let's see "+fruits.get(2));
        System.out.println();
        for(String s :fruits){
            System.out.println(s);
        }
        int j =0;
        for(int i:arr2){
                System.out.println(i+" "+j++);
        }

        for(int[] i : arr) {
            for (int jj : i) {
                System.out.print(jj + " ");
            }

            System.out.println();
        }
    }
}
