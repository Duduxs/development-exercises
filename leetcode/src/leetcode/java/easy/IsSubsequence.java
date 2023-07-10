package leetcode.java.easy;

public class IsSubsequence {

    public static boolean isSubsequence(String s, String t) {

        if (s.isEmpty() || s.isBlank()) return true;

        var timesThatIsSubSequence = 0;
        for (var i = 0; i < t.length(); i++) {

            if (s.charAt(timesThatIsSubSequence) == t.charAt(i)) {
                timesThatIsSubSequence++;
            }

            if (s.length() == timesThatIsSubSequence) {
                return true;
            }

        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(isSubsequence("abc", ""));
        System.out.println(isSubsequence("", ""));
        System.out.println(isSubsequence("abc", "ahbgdc"));
    }
}
