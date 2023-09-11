import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RodaTestsDeCalculadora {

    @Test
    public void testSoma(){

        int resultado = TestCalculadora.somar(20,20);
        assertEquals( 40, resultado);
}

    @Test
    public void testDividir(){

        int resultado = TestCalculadora.dividir(20,10);
        assertEquals( 2, resultado);
    }

    @Test
    public void testMultiplicar(){

        int resultado = TestCalculadora.multiplicar(20,10);
        assertEquals( 200, resultado);
    }

    @Test
    public void testSublitrair(){

        int resultado = TestCalculadora.subtrair(20,10);
        assertEquals( 10, resultado);
    }

}
