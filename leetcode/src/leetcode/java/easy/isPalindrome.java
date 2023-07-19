package leetcode.java.easy;

public class isPalindrome {

    public static boolean isPalindrome(int x) {
        var str = String.valueOf(x);
        var j = 0;
        for (var i = str.length() - 1; i >= 0; i--) {
             if(str.charAt(i) != str.charAt(j)) return false;
             j++;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
    }
}
