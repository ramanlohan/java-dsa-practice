package oops;

import java.util.Date;

public class Transcation {
    private char type;
    private double amount;
    private double balance;
    private Date date;
    private String description;
    public Transcation(){}
    public Transcation(char type, double amount, double balance, String description){
        this.type=type;
        this.amount=amount;
        this.balance=balance;
        this.description=description;
        this.date=new Date();
    }
    public char getType(){
        return type;
    }
    public String toString(){
        return "Transaction{"+"type : "+this.type+",amount : "+this.amount+",balance : "+this.balance+",date : "+
                this.date+",description : "+this.description+"\'"+"}";
    }
}
