
public class PopulatingNextRightPointers {
	
	
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
	public Node connect(Node root) {
		helper(root);
		return root;
	}

	
	public void helper(Node node) {
		
		if(node == null)
			return;
		Node left = node.left;
		Node right = node.right;
		
		while(left != null)
		{
			left.next = right;
			left = left.right;
			right = right.left;
		}
		
		helper(node.left);
		helper(node.right);
		return;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
