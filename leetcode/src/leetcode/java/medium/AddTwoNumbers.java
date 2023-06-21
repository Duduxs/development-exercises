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

        while (l1 != null) {
            firstList.push(l1.val);
            l1 = l1.next;
        }

        Deque<Integer> secondList = new ArrayDeque<>();

        while (l2 != null) {
            secondList.push(l2.val);
            l2 = l2.next;
        }


        var firstNumber = new BigInteger(firstList.stream().map(Object::toString).reduce(String::concat).orElse("0"));
        var secondNumber = new BigInteger(secondList.stream().map(Object::toString).reduce(String::concat).orElse("0"));

        var result = firstNumber.add(secondNumber);

        Deque<Integer> thirdList = new ArrayDeque<>();

        for (var c : String.valueOf(result).toCharArray()) {
            thirdList.add(Integer.parseInt(Character.valueOf(c).toString()));
        }

        var currentListNode = new ListNode(thirdList.poll());

        while (!thirdList.isEmpty()) {
            currentListNode = new ListNode(thirdList.poll(), currentListNode);
        }

        return currentListNode;

    }


    public static void main(String[] args) {
        var data = addTwoNumbers(
                new ListNode(1, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(0,new ListNode(0,new ListNode(0,new ListNode(0,new ListNode(0,new ListNode(0,new ListNode(0,new ListNode(0,new ListNode(0,new ListNode(0,new ListNode(0,new ListNode(0,new ListNode(0,new ListNode(0,new ListNode(0,new ListNode(0,new ListNode(0,new ListNode(0,new ListNode(0,new ListNode(0,new ListNode(0,new ListNode(1))))))))))))))))))))))))))))))),
                new ListNode(5, new ListNode(6, new ListNode(4)))
        );
        System.out.println(data.toString());
    }
}
