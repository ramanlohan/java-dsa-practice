package Dsa.Basics;

import java.util.Scanner;

public class Make_AP {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a= sc.nextInt();
            int c=sc.nextInt();
                if((a+c)%2==0){
                    int b=(a+c)/2;
                    System.out.println(b);
                }
                else{
                    System.out.println(-1);
                }
        }
    }
}
//question Make AP
//Chef is given two integers
//A
//A and
//C
//C such that
//A
//≤
//C
//A≤C.
//
//Chef wants to find whether there exists any integer
//B
//B such that
//A
//,
//B
//,
//A,B, and
//C
//C are in arithmetic progression.
//
//Input Format
//The first line of input will contain a single integer
//T
//T, denoting the number of test cases.
//Each test case consists of two space-separated integers
//A
//A and
//C
//C, the given integers.
//Output Format
//For each test case, output
//−
//1
//−1 if there exists no integer
//B
//B such that
//A
//,
//B
//,
//A,B, and
//C
//C are in arithmetic progression. Else, output the value of
//B
//B.
//
//Constraints
//1
//≤
//T
//≤
//60
//1≤T≤60
//1
//≤
//A
//≤
//C
//≤
//10
//1≤A≤C≤10
//Sample 1:
//Input
//Output
//4
//3 5
//6 6
//2 7
//1 9
//4
//6
//-1
//5
//Explanation:
//Test case
//1
//1: Considering
//B
//=
//4
//B=4, the three integers are in arithmetic progression as
//B
//−
//A
//=
//C
//−
//B
//=
//1
//B−A=C−B=1.
//
//Test case
//2
//2: Considering
//B
//=
//6
//B=6, the three integers are in arithmetic progression as
//B
//−
//A
//=
//C
//−
//B
//=
//0
//B−A=C−B=0.
//
//Test case
//3
//3: There exists no integral value of
//B
//B such that
//A
//,
//B
//,
//A,B, and
//C
//C are in arithmetic progression.
//
//Test case
//4
//4: Considering
//B
//=
//5
//B=5, the three integers are in arithmetic progression as
//B
//−
//A
//=
//C
//−
//B
//=
//4
//B−A=C−B=4.