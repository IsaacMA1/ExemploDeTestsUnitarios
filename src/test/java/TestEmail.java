public class TestEmail {

    public static boolean validarEmail(String email){


        return email.matches("^[A-Za-z0-9+_.-]+@(.+)$");

    }

}



