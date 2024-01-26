import java.util.ArrayList;
import java.util.List;

class ListNode {
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

public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }

        ListNode lastNode = removeLast(head);

        if (head.val == lastNode.val) {
            return isPalindrome(removeFirst(head));
        }

        return false;
    }

    public static ListNode removeFirst(ListNode head) {
      if(head == null || head.next == null) {
          return null;
      }
      head = head.next;
      return head;
    }

    public static ListNode removeLast(ListNode head) {

        if (head == null || head.next == null) {
            return null;
        }

        ListNode current = head;
        ListNode previous = null;

        while (current.next != null) {
            previous = current;
            current = current.next;
        }

        previous.next = null;

        return current;
    }

    public static void main(String[] args) {
        // Example usage
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(2, new ListNode(1)))));

        PalindromeLinkedList palindromeLinkedList = new PalindromeLinkedList();
        boolean isPalindrome = palindromeLinkedList.isPalindrome(head);
        System.out.println("Is Palindrome: " + isPalindrome);
    }
}

