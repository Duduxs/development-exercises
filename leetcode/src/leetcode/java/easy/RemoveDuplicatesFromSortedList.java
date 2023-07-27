package leetcode.java.easy;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class RemoveDuplicatesFromSortedList {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode deleteDuplicates(ListNode head) {
        Queue<Integer> sortedData = new PriorityQueue<>(Comparator.naturalOrder());

        if(head == null) return null;

        var curr = head;

        while (curr != null) {
            if (!sortedData.contains(curr.val)) sortedData.add(curr.val);
            curr = curr.next;
        }

        if(sortedData.isEmpty()) return null;

        var main = new ListNode(sortedData.poll());
        curr = main;

        while (!sortedData.isEmpty()) {
            curr.next = new ListNode(sortedData.poll());
            curr = curr.next;
        }

        return main;

    }

    public static void main(String[] args) {
        deleteDuplicates(new ListNode(1, new ListNode(2, new ListNode(3))));
    }

}
