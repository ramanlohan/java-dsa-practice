package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Project {
    public static void main(String[] args) {
        Project obj = new Project();
        ArrayList<Integer> intt = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Choose an option");
            System.out.println("1.Add");
            System.out.println("2.Remove");
            System.out.println("3.Display");
            System.out.println("4.Exit");
            System.out.print("Your choice : ");
            int n = sc.nextInt();
            if (n == 1) {
                System.out.print("Enter an integer ");
                int add = sc.nextInt();
                intt.add(add);
                System.out.println("Added");
            } else if (n == 2) {
                System.out.println("enter element index (it starts from 0) you want to remove");
                int index = sc.nextInt();
                if (index < 0 || index > intt.size()) {
                    System.out.println("enter valid index");
                } else {
                    intt.remove(index);
                    System.out.println("Removed");
                }
            } else if (n == 3) {

                System.out.println(intt);


            } else if (n == 4) {
                System.out.println("thanks and bye");
                break;
            } else {
                System.out.println("please enter a valid number");
            }
        }

    }

    public void method1() {
        System.out.println("method object from class project ");

    }

    public static void method2() {
        System.out.println("method2  object from class project ");
    }
}