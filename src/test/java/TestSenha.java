public class TestSenha {

    public static boolean validarSenha(String senha){

        //Essa expressão regular exige que a senha contenha pelo menos um dígito,
        //uma letra minúscula, uma letra maiúscula e tenha no mínimo 8 caracteres de comprimento

        return senha.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,}$");

    }


}
