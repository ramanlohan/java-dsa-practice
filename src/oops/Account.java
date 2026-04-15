package oops;
import java.util.ArrayList;
import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private Date dateCreated;
    private Client client;
    protected ArrayList<Transcation> transcations;
    Account(){}
    public Account(int id,double balance,Client client){
        this.id=id;
        this.balance=balance;
        this.dateCreated = new Date();
        this.client=client;
        this.transcations=new ArrayList<>();
    }
    public boolean withdraw(double amount){
        if(amount<=this.balance) {
            this.balance = this.balance - amount;
            System.out.println("Amount withdrawed");
            this.transcations.add(new Transcation('W',amount,this.balance,"Withdrawn : "+amount));
            return true;
        }
        else{
            System.out.println("You don't have enough balance");
            return false;
        }
    }
    public void deposit(double amount){
        this.balance=this.balance+amount;
        this.transcations.add(new Transcation('D',amount,this.balance,"Deposited : "+amount));
        System.out.println("Amount Deposited");
    }
    public int getId(){
        System.out.println(this.id);
        return id;
    }
    public double getBalance(){
        System.out.println(this.balance);

        return balance;
    }

    public Date getDate(){
        System.out.println(this.dateCreated);
        return this.dateCreated;
    }
    public void setId(int id){
        this.id=id;
    }
    public void setBalance(double balance){
         this.balance=balance;
    }

    Transcation trans=new Transcation();
    public String toString(){
        return this.id+" "+this.balance+" "+this.dateCreated+"\n"+transcations;
    }
    public Client getClient(){
        System.out.println(client);
        return client;
    }

    public int countTransactions(char type){
        int count =0;
        for(Transcation transcation:transcations){
            if(transcation.getType()==type){
            count++;
            }
        }
        return count;
    }

}
