package atm;

public class CustomerMain {
    public static void main(String[] args) {
        Customer cust1 = new Customer(1,"Superman","1111");
        Customer cust2 = new Customer(2,"Supergirl","2222");
        cust1.getAccount().deposit(500);
        cust2.getAccount().deposit(1000);
        cust2.getAccount().withdraw(300);
        System.out.println(cust1);
        System.out.println(cust2);
    }
}
