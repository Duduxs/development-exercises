package leetcode.java.easy;

public class FindTheIndexOfTheFirstOccurrenceInAString {

    public static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    public static void main(String[] args) {
        System.out.println(strStr("sadbutsad", "sad"));
    }
}
