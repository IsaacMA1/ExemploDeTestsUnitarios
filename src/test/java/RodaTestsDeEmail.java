import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RodaTestsDeEmail {

    @Test
    public void testEmailValido(){

      assertTrue(TestEmail.validarEmail("isaacalb@gmail.com"));
      assertTrue(TestEmail.validarEmail("isaacalbE2etreinamento@gmail.com"));

    }

    @Test
    public void testEmailInvalido(){
        assertFalse(TestEmail.validarEmail("isaacalbgmail.com"));
        assertFalse(TestEmail.validarEmail("isaacalbE2etreinamento@"));

    }

}