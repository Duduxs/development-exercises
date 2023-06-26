package leetcode.java.easy;

public class LengthOfLastWord {

    public static int lengthOfLastWord(String s) {

        var data = s.split(" ");
        return data[data.length - 1].length();

    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World"));
    }

}
