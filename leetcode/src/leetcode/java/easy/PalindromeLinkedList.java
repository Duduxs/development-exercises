package leetcode.java.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PalindromeLinkedList {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static boolean isPalindrome(ListNode head) {

        var current = head;

        List<Integer> values = new ArrayList<>();

        while(current != null) {
            values.add(current.val);
            current = current.next;
        }

        var valuesReversed = new ArrayList<>(values);
        Collections.reverse(valuesReversed);

        for(var i = 0 ; i < values.size() ; i ++) {
            if(!values.get(i).equals(valuesReversed.get(i))) return false;
        }

        return true;

    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(
                new ListNode(1, new ListNode(2, null))));
        System.out.println(isPalindrome(
                new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1, null))))));
    }
}
