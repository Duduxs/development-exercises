package src.strings.exercises;

public class DominioEmail {

    public static void main(String[] args) {
        System.out.println(extractInformation("joao.silva23@yahoo.com.br"));
        System.out.println(extractInformation("maria123@gmail.com"));
    }

    public static EmailInfo extractInformation(String email) {
        var emailData = email.split("@");
        return new EmailInfo(emailData[0], emailData[1], email.endsWith(".br"));
    }

    record EmailInfo(String usuario, String dominio, Boolean brasileiro) {}
}
