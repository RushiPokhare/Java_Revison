package Variables;
//Local Variable  Real world Example
// withdraw is a Instance method that is why here object is created
public class ATM {
    void withdraw(){
        int pin=1234;
        int amount=7500;

        System.out.println("Pin is"+  +pin+" "+"Amount is"+  +amount);
    }

    public static void main(String[] args) {
        ATM A1=new ATM();
        A1.withdraw();
    }
}
