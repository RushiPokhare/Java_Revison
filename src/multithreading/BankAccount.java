package multithreading;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class BankAccount{
    private int accountNO;
    private double balance;
    private String acHolder;

    public void withdraw(double ammount){
        balance-=ammount;
    }
    public void Diposite(double ammount){
        balance+=ammount;
    }
    public double CheckBalance(){
        return balance;
    }

    public static void main(String[] args) throws InterruptedException {
        BankAccount bankAccount=new BankAccount(123,5000000,"Rushi");

        Thread ATM=new Thread(()->{ bankAccount.withdraw(13445);});

        Thread UPI=new Thread(()->{bankAccount.Diposite(45657);});

        Thread NetBanking=new Thread(()->{bankAccount.withdraw(56543);});

        ATM.start();
        UPI.start();
        NetBanking.start();

        ATM.join();
        UPI.join();
        NetBanking.join();

        System.out.println("Account Balance is -->"+bankAccount.balance);
    }

}


