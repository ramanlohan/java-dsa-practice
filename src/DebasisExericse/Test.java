package DebasisExericse;

import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        System.out.println(dayName(6));//1st question
        System.out.println(sum(27,-6));//2nd question
        System.out.println(utl('N'));//3rd question
        System.out.println(ltu('m'));//4th question
        System.out.println(checkUppercase('H'));//5th question
        System.out.println(checkLowercase('H'));//6th question
        System.out.println(checkEven(78));//7th question
        System.out.println(square(99));//8th question
        System.out.println(cube(99));//9th question
        System.out.println(lastQuestion('7'));//10th question
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter a number");
        int x = sc.nextInt();
        System.out.println(x);
        System.out.println("Enter a string");
        String y = sc.next();
        sc.nextLine();
        System.out.println(y);



        System.out.println("Enter your name");
        String name=sc.nextLine();
        System.out.println("Enter your Year of Pass Out");
        int year = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter your Phone number");
        String phone = sc.nextLine();
        System.out.println("Enter your College Name");
        String collegeName = sc.nextLine();
        System.out.println("Enter your age");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter your Address");
        String address = sc.nextLine();
        System.out.println("Enter your cgpa");
        float cgpa = sc.nextFloat();
        System.out.println("Your name is "+name+" and your yop is "+year+" and phone number is "+phone+" and college is "+collegeName+" with your age being "+age+" and you live at "+address+" and you got "+cgpa+"CGPA");
    }
    //This is First question
    public static String dayName(int dayNumber){
        if(dayNumber==1){
            return "Monday";}
        else if(dayNumber==2){
            return "Tuesday";
        }
        else if(dayNumber==3){
            return "Wednesday";
        }
        else if(dayNumber==4){
            return "Thursday";
        }
        else if(dayNumber==5){
            return "Friday";
        }
        else if(dayNumber==6){
            return "Saturday";
        }
        else if(dayNumber==7){
            return "Sunday";
        }
        else {
            return "enter number between 1 and 7";
        }
    }
    //This is Second question
    public static int sum(int num1,int num2){
        int sum=num1+num2;
        return sum;
    }
    //This is Third question
    public static char utl(char c) {
        if (c >= 'A' && c <= 'Z') {
            char converter = (char) (c + 32);
            return converter;
        } else {
            return c;
        }
    }
        //This is Fourth question
        public static char ltu(char c){
            if(c>='a' && c<='z') {
                char converter = (char)(c-32);
                return converter;
            }
            else {
                return c;
            }
    }
    //This is Fifth question
    public static boolean checkUppercase(char c) {
        if (c >= 'A' && c <= 'Z') {
            return true;
        } else {
            return false;
        }
    }
    //This is Sixth question
    public static boolean checkLowercase(char c) {
        if (c >= 'a' && c <= 'z') {
            return true;
        }
        else{return false;}
    }
    //This is Seventh question
    public static boolean checkEven(int num){
        if(num%2==0){
            return true;
        }
        else{return false;}
    }
    //This is Eighth question
    public static int square(int num){
        int result=num*num;
        return result;
    }
    //This is Ninth question
    public static int cube(int num){
        int result=num*num*num;
        return result;
    }
    //This is Tenth question
    public static String lastQuestion(char a ){
        if(a>='A'&&a<='Z'){
            char converter = (char) (a+32);
            return converter+" ";
        }
        else if(a>='a'&&a<='z'){
            char converter = (char) (a-32);
            return converter+" ";
        }
        else if (a>='0'&&a<='9'){
            int convert = (int)a;
            convert = convert-48;
            if(convert%2==0) {
                return "it is even";
            }
            else {
                return "it is odd";
            }
        }
        else if(a=='!'||a=='@'||a=='#'||a=='$'||a=='%'||a=='^'||a=='&'||a=='*'||a=='('||a==')')
        {
            int typeCasting= (int)a;
            return typeCasting+" ";
        }
        else {return "it is a character";

        }
    }
}
