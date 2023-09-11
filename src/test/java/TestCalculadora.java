public class TestCalculadora {


    public static int somar(int n1, int n2){

    int resultado = n1 + n2;
    return resultado;

    }

    public static int dividir(int n1, int n2){

        if (n2 == 0){

            throw new ArithmeticException("Não é possivel dividir por zero");

        }
        int resultado = n1 / n2;
        return resultado;

    }

    public static int multiplicar(int n1, int n2) {

        if (n2 == 0) {

            throw new ArithmeticException("Não é possivel multiplicar por zero");

        }
        int resultado = n1 * n2;
        return resultado;

    }

    public static int subtrair(int n1, int n2) {


        int resultado = n1 - n2;
        return resultado;

    }

}
