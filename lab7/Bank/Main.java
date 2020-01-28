package lab7.Bank;

public class Main {
    public static void main(String[] args) throws Exception{
        BankAccount a= new BankAccount("1",50);
        BankAccount b=new BankAccount("2",100);

        TransactionThread trans = null;
        System.out.println("before ");
        System.out.println(a);
        System.out.println(b);
        for(int i=0;i<3;i++){

            trans = new TransactionThread("Transfer " +i,a,b,20);
            trans.start();
        }

    }
}
