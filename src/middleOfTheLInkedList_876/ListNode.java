package middleOfTheLInkedList_876;

import java.util.LinkedList;

//  Definition for singly-linked list.
public class ListNode extends LinkedList {
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
