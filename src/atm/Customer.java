package atm;

public class Customer {
    // 1.instance variables แบ่งออกเป็น 2 ประเภท
    // 1.1 attributes
    private int id;
    private String name;
    private String pin;
    // 1.2 composition  : "Has-A" relationship
    private BankAccount account;

    public Customer(int id, String name, String pin) {
        this.id = id;
        this.name = name;
        this.pin = pin;
        this.account = new BankAccount(id,name,"Saving");
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BankAccount getAccount() {
        return account;
    }

    public void setAccount(BankAccount account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", account=" + account +
                '}';
    }
}
