package src.recursivity.exercises;

public class ContaCaracteres {

    public static void main(String[] args) {
        System.out.println(charCount('b', "Batata para o bebê"));
        System.out.println(charCount('a', "Adoleta!a"));
        System.out.println(charCount('x', "Adoleta!a"));
    }

    public static int charCount(char ch, String text) {
        return charCount(ch, text, 0, 0);
    }

    public static int charCount(char ch, String text, int textPosition, int times) {
        if (text.length() == textPosition) {
            return times;
        }

        if (Character.toUpperCase(text.charAt(textPosition)) == Character.toUpperCase(ch)) {
            times++;
        }

        return charCount(ch, text, textPosition + 1, times);
    }
}
