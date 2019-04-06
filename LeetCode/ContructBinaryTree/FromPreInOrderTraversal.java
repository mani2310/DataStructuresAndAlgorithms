
public class FromPreInOrderTraversal {
	
	
	static class TreeNode
	{
		TreeNode left;
		TreeNode right;
		int val;
		
		public TreeNode(int x) { val = x; }
	}
	
	
	public static TreeNode buildTree(int[] preorder, int[] inorder) {
	    return helper(0, 0, inorder.length - 1, preorder, inorder);
	}

	public static TreeNode helper(int preStart, int inStart, int inEnd, int[] preorder, int[] inorder) {
	    if (preStart > preorder.length - 1 || inStart > inEnd) {
	        return null;
	    }
	    TreeNode root = new TreeNode(preorder[preStart]);
	    int inIndex = 0; // Index of current root in inorder
	    for (int i = inStart; i <= inEnd; i++) {
	        if (inorder[i] == root.val) {
	            inIndex = i;
	        }
	    }
	    root.left = helper(preStart + 1, inStart, inIndex - 1, preorder, inorder);
	    root.right = helper(preStart + inIndex - inStart + 1, inIndex + 1, inEnd, preorder, inorder);
	    return root;
	}

	/*public static void printInorder(TreeNode node) { 
        if (node == null) { 
            return; 
        } 
        printInorder(node.left); 
        System.out.print(node.val + " "); 
        printInorder(node.right); 
    } */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] inorder = {3,2,1,9,8};
		int[] postorder= {3,2,1,0,7};
		
		
		buildTree(inorder, postorder);
		
		

	}
	}
