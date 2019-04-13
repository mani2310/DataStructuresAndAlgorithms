import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InOrderTraversal {

	
	public class TreeNode {
	      int val;
	     TreeNode left;
	     TreeNode right;
	    TreeNode(int x) { val = x; }
	 }

	//recursive solution
	public static List<Integer> inOrderTraversal(TreeNode root) {
		
		 List<Integer> ansList = new ArrayList<Integer>();
	        backtrack(ansList, root);
	        return ansList;
	}
	
	public static void backtrack( List<Integer> ansList,TreeNode root) {
		
		if(root == null)
			return;
		backtrack(ansList,root.left);
		ansList.add(root.val);
		backtrack(ansList,root.right);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
