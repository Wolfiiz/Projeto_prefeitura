package utils;

public class Validation {
    public static boolean validarEmail(String email) {
        return email.contains("@") && email.contains(".");
    }

    public static boolean validarSenha(String senha) {
        return senha.length() >= 6;
    }
}
