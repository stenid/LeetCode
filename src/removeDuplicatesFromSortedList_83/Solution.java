package removeDuplicatesFromSortedList_83;

public class Solution {                                     // [1,1,2]; [1,1,2,3,3]

        public ListNode deleteDuplicates(ListNode head) {
            ListNode currentNode = head;
            while(currentNode != null && currentNode.next != null) {
                if (currentNode.next.val == currentNode.val)
                    currentNode.next = currentNode.next.next;

                else
                    currentNode = currentNode.next;
            }
            return head;
        }
    }


/*
83. Remove Duplicates from Sorted List

Easy
6.9K
241
Companies

Given the head of a sorted linked list, delete all duplicates such that each
element appears only once. Return the linked list sorted as well.



Example 1:


Input: head = [1,1,2]
Output: [1,2]

Example 2:


Input: head = [1,1,2,3,3]
Output: [1,2,3]


Constraints:

The number of nodes in the list is in the range [0, 300].
-100 <= Node.val <= 100
The list is guaranteed to be sorted in ascending order.
 */
