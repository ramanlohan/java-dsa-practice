package oops;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

//        Circle class

//        System.out.println(Circle.getNumberOfCircles());
//        Circle c1 = new Circle();
//        System.out.println(c1.radius);
//        Circle c2 = new Circle(new Point(1,2),22);
//        c1.setCenter(new Point(1,2));
//        c1.setRadius(3);
//        System.out.println("Area = "+c1.getArea());
//        System.out.println("Perimeter = "+c1.getPerimeter());
//        System.out.println(Circle.getNumberOfCircles());

//        Rectangle class

//        Rectangle[] rectangles = new Rectangle[3];
//        for(int i=0;i<rectangles.length;i++){
//            System.out.println("Do you want extra width and height?(y/n)");
//            char choice =  sc.next().charAt(0);
//            if(choice=='y'){
//                rectangles[i]= new Rectangle(sc.nextDouble(),sc.nextDouble());
//            }
//            else if(choice=='n'){
//                rectangles[i]=new Rectangle();
//            }
//            else {
//                System.out.println("invalid");
//                rectangles[i]=new Rectangle();
//            }
//        }
//        System.out.println("The rectangles are:-");
//
//        for(int i=0;i<rectangles.length;i++){
//            System.out.println("width of rectangle : "+(i+1)+" is "+rectangles[i].getWidth()+" and height is :- "+rectangles[i].getHeight());
//        }

//        Account class

//        Account testAccount=new Account(1,50000,11.4);
//        Account testAccount2=new Account(1122,20000,4.5);
//        testAccount2.withdraw(2500);
//        testAccount2.deposit(3000);
//        testAccount2.getId();
//        testAccount2.getBalance();
//        testAccount2.getAnnualInterestRate();
//        testAccount2.getDate();


//        Client class

//        Client[] clients= new Client[2];
//        clients[0]=new Client(101,"Raman","8059409849");
//        clients[0].addAccount(new Account(1,50000,11.4));
//        clients[0].addAccount(new Account(2,40000,10));
//        clients[1]= new Client(102,"Anchal","6280006421");
//        clients[1].addAccount(new Account(5,54000,9));
//        clients[1].addAccount(new Account(6,5000,9.9));
//        clients[1].addAccount(new Account(7,4000,9.3));
//        System.out.println(clients[0].toString());
//        System.out.println(clients[1].toString());

//        ArrayList<Account> accounts= new ArrayList<>();
//        Client client = new Client(101,"Raman","72343245");
//        Client client2 = new Client(101,"Raman","72343245");
//        accounts.add(new Account(1,50000,2,client2));
//        accounts.add(new Account(2,5000,2.4,client));
//        accounts.get(0).withdraw(2000);
//        accounts.get(0).withdraw(1000);
//        accounts.get(0).deposit(7000);
//        accounts.get(0).withdraw(2000);
//
//        accounts.get(0).deposit(100);
//        accounts.get(1).deposit(300);
//
//        for(Account account:accounts){
//            System.out.println("account "+account.getId()+":");
//            System.out.println("W : "+account.countTransactions('W'));
//            System.out.println("D : "+account.countTransactions('D'));
//        }
//        System.out.println(accounts.get(0));

//        Rectangle class again

//        upcasting
//        GeometricObject obj = new GeometricObject(true,"white");
//        System.out.println(obj.toString());
//        Object v1=new GeometricObject();
//        Rectangle v2=(Rectangle) v1;
        Client client = new Client(100,"xyz","345");
        Account[] accounts=new Account[2];
        accounts[0]=new SavingAccount(1,1000,client,4.5);
        accounts[0].withdraw(500);
        accounts[0].deposit(200);

        accounts[1]=new CurrentAccount(2,2000,client,-200);
        accounts[1].withdraw(2000);
        accounts[1].withdraw(200);
        accounts[1].withdraw(100);
        accounts[1].deposit(400);

        System.out.println(Arrays.toString(accounts));
    }
}
