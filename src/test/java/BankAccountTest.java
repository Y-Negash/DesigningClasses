import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccountTest {

    private BankAccount bankAccount;

    @BeforeEach
    public void setUp() {
        bankAccount = new BankAccount("John", "Doe", "01/01/01", 456);
    }
    
    @Test // first getter test
    public void canGetFirstName() {
        String actual = bankAccount.getFirstName();
        String expected = "John";
        assertThat(actual).isEqualTo(expected);
    }
    @Test // first setter test
    public void canSetFirstName() {
       bankAccount.setFirstName("John");
       String actual = bankAccount.getFirstName();
        assertThat(actual).isEqualTo("John");
    }


}