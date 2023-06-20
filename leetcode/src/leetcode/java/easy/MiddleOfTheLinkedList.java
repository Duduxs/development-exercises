package leetcode.java.easy;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class MiddleOfTheLinkedList {

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


    public static ListNode middleNode(ListNode head) {

        List<ListNode> data = new ArrayList<>();

        while (head != null) {
            data.add(head);
            head = head.next;
        }

        var currentSize = data.size() - 1;
        var middleIndex = BigDecimal.valueOf(currentSize).divide(BigDecimal.valueOf(2), RoundingMode.UP);

        return data.stream().filter(x -> data.indexOf(x) == middleIndex.intValue()).findFirst().get();

    }


    public static void main(String[] args) {

    }

}
