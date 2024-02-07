import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccountTest {

    private BankAccount bankAccount;

    @BeforeEach
    public void setUp() {
        bankAccount = new BankAccount("Yabbi", "qw", "12/24/4", 9);
    }

    @Test
    public void canGetFirstName() {
        String actual = bankAccount.getFirstName();
        String expected = "Yabbi";
        assertThat(actual).isEqualTo(expected);

    }
}