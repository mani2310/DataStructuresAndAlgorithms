import java.util.HashMap;

//import PathSum.TreeNode;

public class FromInPostOrderTraversal {
	
	static class TreeNode
	{
		TreeNode left;
		TreeNode right;
		int val;
		
		public TreeNode(int x) { val = x; }
	}
	
	
	public static TreeNode buildTree(int[] inorder, int[] postorder) {
	    return build(inorder, inorder.length-1, 0, postorder, postorder.length-1);
	}

	private static TreeNode build(int[] inorder, int inStart, int inEnd, int[] postorder,
			int postStart) {
		if (postStart < 0 || inStart < inEnd)
			return null;
		
		//The last element in postorder is the root.
		TreeNode root = new TreeNode(postorder[postStart]);
		
		//find the index of the root from inorder. Iterating from the end.
		int rIndex = inStart;
		for (int i = inStart; i >= inEnd; i--) {
			if (inorder[i] == postorder[postStart]) {
				rIndex = i;
				break;
			}
		}
		//build right and left subtrees. Again, scanning from the end to find the sections.
		root.right = build(inorder, inStart, rIndex + 1, postorder, postStart-1);
		root.left = build(inorder, rIndex - 1, inEnd, postorder, postStart - (inStart - rIndex) -1);
		return root;
	}
	public static void printInorder(TreeNode node) { 
        if (node == null) { 
            return; 
        } 
        printInorder(node.left); 
        System.out.print(node.val + " "); 
        printInorder(node.right); 
    } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] inorder = {3,2,1};
		int[] postorder= {3,2,1};
		
		
		printInorder(buildTree(inorder, postorder));
		
		

	}

}
