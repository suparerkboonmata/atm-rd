package atm;

public class Atm {
    private Bank bk;
    private Customer currentCustomer;

    public Atm(Bank bk) {
        this.bk = bk;
    }

    public void validateCustomer(int id,String pin){
        Customer matchingCustomer = bk.findCustomer(id);
            if(matchingCustomer != null && matchingCustomer.checkPin(pin)){
                currentCustomer = matchingCustomer;
            }
        }

    public void deposit(double amount){
        currentCustomer.getAccount().deposit(amount);
    }

    public void withdraw(double amount){
        currentCustomer.getAccount().withdraw(amount);
    }

    public void transfer(int receiverId,double amount){
        Customer receiver = bk.findCustomer(receiverId);
        currentCustomer.getAccount().withdraw(amount);
        receiver.getAccount().deposit(amount);
    }

    public double getBalance(){
        return currentCustomer.getAccount().getBalance();
    }
    public void end(){
        currentCustomer = null;
    }
}
