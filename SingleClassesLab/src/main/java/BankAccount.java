public class BankAccount {
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String accountType;
    private int accountNumber;
    private double balance;
    private double overdraft;


//    Constructor
public BankAccount(String firstName, String lastName, String dateOfBirth,String accountType, int accountNumber){

    this.firstName = firstName;
    this.lastName = lastName;
    this.dateOfBirth = dateOfBirth;
    this.accountType = accountType;
    this.accountNumber = accountNumber;
    this.balance = 0;
    this.overdraft = -300;
}
// GETTERS AND SETTERS

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

// Deposit Method
    public void deposit(int depositedValue){
     this.balance += depositedValue;
    }
// Withdrawal Method
    public void withdrawal(int withdrewValue){
    if (this.balance >= this.overdraft) {
        this.balance -= withdrewValue;
    }
    if(this.balance < this.overdraft){
        this.balance = 0;
    }
}
// Interest Method
    public void payInterest(){
    if (this.accountType.equals("Current")){
        this.balance = (this.balance * 1.02);
    }
    if (this.accountType.equals("Savings")){
        this.balance = (this.balance * 1.04);
        }
    }

}
