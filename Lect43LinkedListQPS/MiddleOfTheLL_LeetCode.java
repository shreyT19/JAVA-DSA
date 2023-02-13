package Lect43LinkedListQPS;



import Lect42LinkedList.LinkedList.Node;

import java.util.LinkedList;

public class MiddleOfTheLL_LeetCode {

    public class ListNode {

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

    class Solution {
        public ListNode middleNode(ListNode head) {
            ListNode fast = head;
            ListNode slow = head;

            while(fast!=null && fast.next!=null){
                fast=fast.next.next;
                slow= slow.next;
            }
            return slow;
        }
    }
}
