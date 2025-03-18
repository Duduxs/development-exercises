package src.strings.exercises;


public class Senha {

    public static void main(String[] args) {
        System.out.println(validatePassword("amerca1@"));
        System.out.println(validatePassword("amrca154682"));
    }

    public static String validatePassword(String password) {
        var hasEightOrMoreDigits = false;
        var hasAtLeastOneLetter = false;
        var hasAtLeastOneSpecialChar = false;
        var hasAtLeastOneNumber = false;

        if (password.length() >= 8) {
            hasEightOrMoreDigits = true;
        }

        for (var i = 0; i < password.length(); i++) {
            var character = password.charAt(i);
            if (Character.isLetter(character)) {
                hasAtLeastOneLetter = true;
            }
            if (Character.isDigit(character)) {
                hasAtLeastOneNumber = true;
            }
            if (!Character.isSpaceChar(character) && !Character.isLetterOrDigit(character)) {
                hasAtLeastOneSpecialChar = true;
            }
        }

        return (hasEightOrMoreDigits
                && hasAtLeastOneLetter
                && hasAtLeastOneSpecialChar
                && hasAtLeastOneNumber) ? "VALIDA" : "INVALIDA";
    }

}
