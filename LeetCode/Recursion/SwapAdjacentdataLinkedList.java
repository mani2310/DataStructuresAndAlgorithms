
public class SwapAdjacentdataLinkedList {
	
	
	
	  //Definition for singly-linked list.
	  public class ListNode {
	      int val;
	      ListNode next;
	     ListNode(int x) { val = x; }
	  }
	    public ListNode swapPairs(ListNode head) {
	        
	    	   
	        if(head !=null && head.next != null )
	        {
	            int k = head.val;
	            head.val = head.next.val;
	            head.next.val = k;
	            swapPairs(head.next.next);
	        }
	        
	        
	        return head;
	        
	    }
	}


