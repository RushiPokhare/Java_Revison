package Variables;
//Using Static Variable
public class ATM2 {
    static void withdraw(){
        int pin=1234;
        int amount=7500;

        System.out.println("Pin is"+  +pin+" "+"Amount is"+  +amount);
    }

    public static void main(String[] args) {
        ATM2.withdraw();
    }
}
