import java.util.LinkedList;
import java.util.Queue;

public class BFSPopNextRightPtr {

	
	// Definition for a Node.
		class Node {
		    public int val;
		    public Node left;
		    public Node right;
		    public Node next;

		    public Node() {}

		    public Node(int _val,Node _left,Node _right,Node _next) {
		        val = _val;
		        left = _left;
		        right = _right;
		        next = _next;
		    }
		};
		
		public static Node connect(Node root) {
			if(root == null)
				return root;
			
			Queue<Node> q = new LinkedList<>();
			
			q.add(root);
			
			while(!q.isEmpty())
			{
				int n = q.size();
				for (int i = 0; i < n; i++) {
					
					Node temp = q.poll();
					
					if(temp.left != null)
						q.add(temp.left);
					if(temp.right != null)
						q.add(temp.right);
					
					Node temp1;
					
					if(i==n-1)
						temp1 = null;
					else
						temp1 = q.peek();
					
					temp.next = temp1;
				}
			}
			return root;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}

}
