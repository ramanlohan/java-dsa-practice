package oops;

public class CurrentAccount extends Account{
    private double limitBelowZero;
     CurrentAccount(int id, double balance, Client client,double limitBelowZero) {
        super(id, balance, client);
        this.limitBelowZero=limitBelowZero;
    }
    @Override
    public String toString(){
         return super.toString()+"CurrentAccount{"+
                 "limitBelowZero="+limitBelowZero+
                 '}';
    }
    @Override
    public boolean withdraw(double amount){
         if(super.getBalance()-amount<limitBelowZero){
             return false;
         }
         super.setBalance(super.getBalance()-amount);
         super.transcations.add(new Transcation('W',amount,super.getBalance(),"Withdrawn"+amount));
         return true;
    }
}
