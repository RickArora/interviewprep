import java.util.*;
import java.util.Hashtable;

class removeDups {

  // working version below

  HashSet<Integer> uniqueElements = new HashSet<Integer>();
        ListNode current = head;
        ListNode previous = null;
        while(current != null) {
            if(uniqueElements.contains(new Integer(current.val))) {
                previous.next = previous.next.next;
            }
            else {
                uniqueElements.add(new Integer(current.val));
                previous = current;
            }
            current = current.next;
        }
        return head;
    }
    // working version end
    public static void removeDuplicates(LinkedListNode head) {
        /* Ideas: throw each value into a set which intially has only one value ( first element of the list),
        if the value is a repeat skip that node 
        */

      Set<Integer> removeDups = new HashSet<Integer>();
      LinkedListNode pointerToHead = head;
      removeDups.add(head.data);
      while(pointerToHead.next != null) {
        if(removeDups.contains(pointerToHead.next.data)) {
          pointerToHead = pointerToHead.next.next;
        }
        else {
          removeDups.add(pointerToHead.data);
          pointerToHead = pointerToHead.next;
        }
      }

    }
    
    public static void main(String[] args) {
     LinkedListNode first = new LinkedListNode(0, null, null); // AssortedMethods.randomLinkedList(1000, 0, 2);
     LinkedListNode head = first;
     LinkedListNode second = first;
      for (int i = 1; i < 8; i++) {
        second = new LinkedListNode(i % 2, null, null);
        first.setNext(second);
        second.setPrevious(first);
        first = second;
      }
      System.out.println(head.printForward());
      removeDuplicates(head);
      System.out.println(head.printForward());
    }
  }