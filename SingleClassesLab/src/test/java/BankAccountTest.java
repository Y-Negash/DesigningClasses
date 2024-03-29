import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccountTest {

    private BankAccount bankAccount;

    @BeforeEach
    public void setUp() {
        bankAccount = new BankAccount("John", "Doe", "01/01/01","Current", 456);
    }

    @Test // first name getter test
    public void canGetFirstName() {
        String actual = bankAccount.getFirstName();
        String expected = "John";
        assertThat(actual).isEqualTo(expected);
    }

    @Test // first name setter test
    public void canSetFirstName() {
       bankAccount.setFirstName("John");
       String actual = bankAccount.getFirstName();
        assertThat(actual).isEqualTo("John");
    }
    @Test // last name getter test
    public void canGetLastName() {
        String actual = bankAccount.getLastName();
        String expected = "Doe";
        assertThat(actual).isEqualTo(expected);
    }
    @Test // last name setter test
    public void canSetLastName(){
        bankAccount.setLastName("Doe");
        String actual = bankAccount.getLastName();
        assertThat(actual).isEqualTo("Doe");
    }
    @Test // DOB getter test
    public void canGetDateOfBirth(){
        String actual = bankAccount.getDateOfBirth();
        String expected = "01/01/01";
        assertThat(actual).isEqualTo(expected);
    }
    @Test // DOB setter test
    public void canSetDateOfBirth(){
        bankAccount.setDateOfBirth("01/01/01");
        String actual = bankAccount.getDateOfBirth();
        assertThat(actual).isEqualTo("01/01/01");
    }
    @Test // account number getter test
    public void canGetAccountNumber(){
       int actual = bankAccount.getAccountNumber();
       int expected = 456;
        assertThat(actual).isEqualTo(expected);
    }

    @Test // account number setter test
    public void  canSetAccountNumber(){
        bankAccount.setAccountNumber(456);
        int actual = 456;
        assertThat(actual).isEqualTo(456);
    }
    @Test // balance getter test
    public void canGetBalance(){
        double actual = bankAccount.getBalance();
        double expected = 0;
        assertThat(actual).isEqualTo(expected);
    }
    @Test //  balance setter test
    public void  canSetBalance(){
        bankAccount.setBalance(0);
        double actual = 0;
        assertThat(actual).isEqualTo(0);
    }
    @Test // Deposit method test
    public void CanDepositWork(){
        bankAccount.deposit(1000);
        double actual = bankAccount.getBalance();
        assertThat(actual).isEqualTo(1000);
    }
    @Test // Withdrawal method test
    public void CanWithdrawalWork(){
        bankAccount.withdrawal(300);
        double actual = bankAccount.getBalance();
        assertThat(actual).isEqualTo(-300);
    }
    @Test // Interest method test
    public void CanInterestWork(){
        bankAccount.setBalance(1000);
        bankAccount.payInterest();
        double actual = bankAccount.getBalance();
        assertThat(actual).isEqualTo(1020);
    }


    //
}