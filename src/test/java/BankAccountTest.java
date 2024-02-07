import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccountTest {

    private BankAccount bankAccount;

    @BeforeEach
    public void setUp() {
        bankAccount = new BankAccount("John", "Doe", "01/01/01", 456);
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
}