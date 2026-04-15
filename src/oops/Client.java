package oops;

import java.util.ArrayList;

public class Client {
    private int id;
    private String name;
    private String phone;
    private ArrayList<Account> accounts;
    public Client(int id, String name, String phone){
        this.id=id;
        this.name=name;
        this.phone=phone;
        accounts=new ArrayList<>();
    }
    public boolean addAccount(Account account){
        accounts.add(account);
        System.out.println("account added");
        return true;
    }
    public boolean removeAccount(Account accountID){
        if(accounts.contains(accountID)){
            accounts.remove(accountID);
            System.out.println("account successfully removed");
            return true;
        }
        else {
            System.out.println("account does not exist");
            return false;
        }

    }
    public String toString(){
        String s = this.id+" "+this.name+" "+this.phone+"\n";
        for(Account account:accounts){
            s +=account.toString()+"\n";
        }
        return s;
    }
    public int getId(){
        System.out.println(this.id);
        return this.id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getName(){
        System.out.println(this.name);
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getPhone(){
        System.out.println(this.phone);
        return this.phone;
    }
    public void setPhone(String id){
        this.phone=phone;
    }
}
