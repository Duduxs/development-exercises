package leetcode.java.easy;

public class ValidPalindrome {

    public static boolean isPalindrome(String s) {

        var cleanedString = s.toLowerCase().chars().mapToObj(x -> (char) x).filter(Character::isLetterOrDigit).map(Object::toString).reduce(String::concat).orElse("");

        var sb = new StringBuilder();

        for (var i = cleanedString.length() - 1; i >= 0; i--) {
            sb.append(cleanedString.charAt(i));
        }

        return cleanedString.equals(sb.toString());

    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("race a car"));
        System.out.println(isPalindrome(" "));
    }
}
