package src.recursivity.exercises;

public class Palindromo {

    public static void main(String[] args) {
        System.out.println(isPalindrome(""));
        System.out.println(isPalindrome("aba"));
        System.out.println(isPalindrome("abccba"));
        System.out.println(isPalindrome("abcfba"));
    }

    //1 solução abaixo
    public static boolean isPalindrome(String text) {
        var sb = new StringBuilder();
        isPalindrome(text, text.length() - 1, sb);
        return sb.toString().equals(text);
    }

    public static boolean isPalindrome(String text, int currentPosition, StringBuilder builder) {
        if (currentPosition < 0) {
            return true;
        }

        var head = text.charAt(currentPosition);
        builder.append(head);

        return isPalindrome(text, currentPosition - 1, builder);

    }

    /**
     * 2 solução abaixo
    public static boolean isPalindrome(String text) {
        return isPalindrome(text, text.length() - 1, 0);
    }
    public static boolean isPalindrome(String text, int i, int j) {
        if (i < 0) {
            return true;
        }

        if (text.charAt(i--) != text.charAt(j++)) {
            return false;
        }

        return isPalindrome(text, i, j);

    }
*/
}
