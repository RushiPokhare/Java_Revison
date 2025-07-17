package multithreading;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class BankAccount_Synchronized {
    private int accountNO;
    private double balance;
    private String acHolder;

    synchronized public void withdraw(double ammount){
        balance-=ammount;
    }
    synchronized public void Diposite(double ammount){
        balance+=ammount;
    }
    synchronized public double CheckBalance(){
        return balance;
    }

    public static void main(String[] args) throws InterruptedException {
        BankAccount_Synchronized bankAccount=new BankAccount_Synchronized(123,5000,"Rushi");

        Thread ATM=new Thread(()->{ bankAccount.withdraw(1000);});

        Thread UPI=new Thread(()->{bankAccount.Diposite(2000);});

        Thread NetBanking=new Thread(()->{bankAccount.withdraw(1000);});

        ATM.start();
        UPI.start();
        NetBanking.start();

        ATM.join();
        UPI.join();
        NetBanking.join();

        System.out.println("Account Balance is -->"+bankAccount.balance);
    }

}


