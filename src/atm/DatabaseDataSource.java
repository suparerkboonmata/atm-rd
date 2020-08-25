package atm;

import java.util.ArrayList;

public class DatabaseDataSource {
    public ArrayList<Customer> getCustomerData(){
        //Database จำลอง
        ArrayList<Customer> customers = new ArrayList<Customer>();
        customers.add(new Customer(100,"Captain America","5555"));
        customers.add(new Customer(200,"Iron Man","6666"));

        return customers;
    }
}
