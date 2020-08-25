package atm;

public class CustomerMain {
    public static void main(String[] args) {
        Customer cust1 = new Customer(1,"Superman","1111");
        Customer cust2 = new Customer(2,"Supergirl","2222");
        Bank bk = new Bank("My Bank");
        bk.addCustomer(cust1);
        bk.addCustomer(cust2);
        Atm atm = new Atm(bk);
        atm.validateCustomer(1,"1111");
        atm.deposit(2500);
        atm.getBalance();
        System.out.println(cust1);
        atm.transfer(2,500);
        System.out.println(cust1);
        System.out.println(cust2);


    }
}
