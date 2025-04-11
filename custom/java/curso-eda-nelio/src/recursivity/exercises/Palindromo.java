package src.recursivity.exercises;

public class Palindromo {

    public static void main(String[] args) {
        System.out.println(isPalindrome(""));
        System.out.println(isPalindrome("aba"));
        System.out.println(isPalindrome("abccba"));
        System.out.println(isPalindrome("abcfba"));
    }

    public static boolean isPalindrome(String text) {
        var sb = new StringBuilder();
        isPalindrome(text, text.length() - 1, sb);
        return sb.toString().equals(text);
    }

    public static boolean isPalindrome(String text, int currentPosition, StringBuilder builder) {
        if(currentPosition < 0) {
            return true;
        }

        var head = text.charAt(currentPosition);
        builder.append(head);

        return isPalindrome(text, currentPosition - 1, builder);

    }

}
