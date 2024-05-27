package leetcode;

public class LinkedListPalindrome {

	public static void main(String[] args) {

		LinkedListPalindrome ll1 = new LinkedListPalindrome();
		ListNode head1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
		System.out.println(ll1.isPalindrome(head1));
	}
	
	
	public boolean isPalindrome(ListNode head) {
        ListNode revListHead = reverseList(head);
        ListNode currentHead = head;
        
        printList(revListHead);
        printList(head);
        
        
        do{
            if(revListHead != currentHead)
                return false;
            revListHead = revListHead.next;
            currentHead = currentHead.next;
        }while(currentHead != null);
        return true;
    }

	public ListNode reverseList(ListNode head) {
		ListNode prev = null;
		ListNode current = head;
		while (current != null) {
			ListNode next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		return prev;
	}

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

	public void printList(ListNode head) {
		ListNode current = head;
		while (current != null) {
			System.out.print(current.val);
			if (current.next != null) {
				System.out.print(" -> ");
			}
			current = current.next;
		}
		System.out.println();
	}

}
