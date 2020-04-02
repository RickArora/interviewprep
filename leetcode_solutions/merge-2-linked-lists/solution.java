
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0); // dummyhead to make it easier to return everything after head
        ListNode current = dummyHead; // setting current = dummyHead
         
        while (l1 != null && l2 != null) { // while both lists are not null
            if (l1.val <= l2.val) { // check to see if l2.val is <= l1's value
                current.next = l1; // if l2 > l1 then we set current.next = l1
                l1 = l1.next; // we also move the pointer of l1 one step forward sice l1's current element has already been considered
            }
            else {
                current.next = l2; // otherwise we know l1 > l2 so we set current.next = l2 
                l2 = l2.next; // move l2's pointer up
            }
            current = current.next; // move pointer of current to the newly appended element
        }
        current.next = l1 != null ? l1 : l2; // appends remaining node's to our linked list
        return dummyHead.next; // return a pointer to the head of the list not incl the dummynode we initially created
    }
}