package leetcode.java.medium;

import java.math.BigInteger;
import java.util.ArrayDeque;
import java.util.Deque;

public class AddTwoNumbers {

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

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        Deque<Integer> firstList = new ArrayDeque<>();
        Deque<Integer> secondList = new ArrayDeque<>();
        Deque<Integer> thirdList = new ArrayDeque<>();

        while (l1 != null) {
            firstList.push(l1.val);
            l1 = l1.next;
        }

        while (l2 != null) {
            secondList.push(l2.val);
            l2 = l2.next;
        }

        var firstNumber = new BigInteger(firstList.stream().map(Object::toString).reduce(String::concat).orElse("0"));
        var secondNumber = new BigInteger(secondList.stream().map(Object::toString).reduce(String::concat).orElse("0"));

        var sumResult = firstNumber.add(secondNumber);
        var sumResultAsCharArray = String.valueOf(sumResult).toCharArray();

        for (var character : sumResultAsCharArray) {
           thirdList.add(Integer.parseInt(Character.valueOf(character).toString()));
        }

        var currentListNode = new ListNode(thirdList.poll());

        while (!thirdList.isEmpty()) {
            currentListNode = new ListNode(thirdList.poll(), currentListNode);
        }

        return currentListNode;

    }

    public static void main(String[] args) {
        var data = addTwoNumbers(
                new ListNode(1, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(1))))))))))))))))))))))))))))))),
                new ListNode(5, new ListNode(6, new ListNode(4)))
        );
    }
}
