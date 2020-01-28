package lab7.Bank;

public class BankAccount {
    private int debit;
    private String name;

    public BankAccount(String name, int debit){
        this.name=name;
        this.debit=debit;
    }
    public void withdraw(double amount){
        longDatabaseCall();
      this.debit -= amount;
    }

    public void deposit(double amount){
        longDatabaseCall();
        this.debit += amount;
    }

    private void longDatabaseCall(){
        try{
            Thread.sleep(100);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }

    public String toString(){
        return "Bank account named " + name + " contains " + debit + " $";
    }
}
