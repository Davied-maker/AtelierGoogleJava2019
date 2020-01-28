package lab7.Bank;

public class TransactionThread extends Thread {
    private String name;
    private BankAccount from;
    private BankAccount to;
    private int amount;
    public TransactionThread(String name,BankAccount from, BankAccount to, int amount){
        this.name=name;
        this.from=from;
        this.to=to;
        this.amount=amount;
    }
    @Override
    public void run(){

        transfer();

    }
    private void transfer(){
        synchronized (from) {
            from.withdraw(amount);
            synchronized (to) {
                to.deposit(amount);

                System.out.println("after ");
                System.out.println(from);
                System.out.println(to);
            }
        }
    }
}
