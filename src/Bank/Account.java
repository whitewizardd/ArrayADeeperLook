package Bank;

public class Account {
//    if (account.getAccountNumber().equals(accountNumber)) account;
    private int amount;
    private final String password;
    private final String firstName;
    private final String lastName;
    private String accountNumber;
    public Account(String firstName, String lastName, String password) {
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public void deposit(int amount) {
       if (amount > 0) this.amount += amount;
    }
    public int checkBalance(String password) {
        if (this.password.equals(password)) return amount;

        return 0;
    }
    public void withdraw(String withdrawalPin, int amount) {
        if (this.password.equals(withdrawalPin)) {
            if (amount > 0) this.amount -= amount;
            if (amount > this.amount) this.amount = 0;
        }
        else this.amount = 0;
    }
    public String getAccountNumber(){ return accountNumber; }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}