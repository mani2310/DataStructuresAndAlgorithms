

public class ReverseLinkedList {

	
	public class ListNode {
	      int val;
	      ListNode next;
	     ListNode(int x) { val = x; }
	  }
	
	public static ListNode reverse(ListNode head) {
		
		 if(head !=null && head.next != null )
	        {
			 	return head;
	        }
		 
		ListNode prev = reverse(head.next);
		head.next.next = head;
		head.next = null;
	   return prev;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
