package atm;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Customer> customers;
    private DatabaseDataSource dataSource;

    public Bank(String name) {
        this.name = name;
    //    this.customers = new ArrayList<Customer>();
        this.dataSource = new DatabaseDataSource();
        this.customers = dataSource.getCustomerData();
    }

    public void addCustomer(Customer c){
        customers.add(c);
    }

    public Customer findCustomer(int id){

        for(Customer cust :customers){
            if(cust.getId() == id){
                return cust;
            }
        }
         return  null;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", customers=" + customers +
                '}';
    }
}
