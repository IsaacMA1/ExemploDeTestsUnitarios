import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RodaTestsDeSenha {

    @Test
    public void testSenhaValido(){

        assertTrue(TestSenha.validarSenha("Asaa@ca123"));
        assertTrue(TestSenha.validarSenha("Asaa@543ilcom"));
    }

    @Test
    public void testSenhalInvalido(){
        assertFalse(TestSenha.validarSenha("@@@+oosj++"));
        assertFalse(TestSenha.validarSenha("Opjhwhw$$$%@"));
    }


}
