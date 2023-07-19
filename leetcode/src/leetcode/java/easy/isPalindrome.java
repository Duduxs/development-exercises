package leetcode.java.easy;

public class isPalindrome {

    public static boolean isPalindrome(int x) {
        var sb = new StringBuilder();
        return String.valueOf(x).contentEquals(sb.append(x).reverse());
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
    }
}
