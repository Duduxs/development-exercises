package src.strings.exercises;

public class CPF {

    public static void main(String[] args) {
        System.out.println(sanitize("123.456.789-09"));
        System.out.println(sanitize("87409217293"));
        System.out.println(sanitize("874092172-93"));
        System.out.println(sanitize("874.092.172-93"));
    }

    public static String sanitize(String cpf) {
        final var sb = new StringBuilder();

        for (var i = 0; i < cpf.length(); i++) {
            var c = cpf.charAt(i);
            if (Character.isDigit(c)) {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}
