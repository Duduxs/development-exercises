package leetcode.java.easy;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class MergeTwoSortedLists {

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


    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        Queue<Integer> queue = new PriorityQueue<>(Comparator.naturalOrder());

        var current = list1;

        while (current != null) {
            queue.add(current.val);
            current = current.next;
        }

        current = list2;

        while (current != null) {
            queue.add(current.val);
            current = current.next;
        }

        var data = queue.peek() != null ? new ListNode(queue.poll()) : null;
        var dummy = data;

        while (!queue.isEmpty()) {
            dummy.next = new ListNode(queue.poll());
            dummy = dummy.next;
        }

        return data;
    }

    public static void main(String[] args) {
        System.out.println(mergeTwoLists(
                new ListNode(1, new ListNode(2, new ListNode(4))), new ListNode(1, new ListNode(2, new ListNode(4)))
        ));
    }
}
