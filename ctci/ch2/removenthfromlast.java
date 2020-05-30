class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr = head;
        int count = 0, count2 = 0;
        int sum;
        while (curr != null) {
            curr = curr.next;
            count++;
        } // figure out how long the List is
        curr = head; // reset curr
        sum = count - n;
        while (count2 != summ) {
            curr = curr.next;
            count2++;
        }
        return curr;
    }
}