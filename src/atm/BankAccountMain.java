package atm;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount bacc1 = new BankAccount(1,"Suparerk","Saving");
        BankAccount bacc2 = new BankAccount(3,"Aranya","Checking",1000);
        bacc1.deposit(500);
        bacc2.withdraw(200);
        System.out.println(bacc1.toString());
        System.out.println(bacc2.toString());

    }
}
