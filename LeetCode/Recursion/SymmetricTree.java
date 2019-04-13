
public class SymmetricTree {
	
	class TreeNode
	{
		TreeNode left;
		TreeNode right;
		int val;
		
		public TreeNode(int x) {
			// TODO Auto-generated constructor stub
			this.val = x;
		}
	}
	
	public boolean isSymmetric(TreeNode root) {
		
		if(root == null)
			return true;
		
		return isMirror(root,root);
		
	}
	
	public boolean isMirror(TreeNode node1, TreeNode node2) {
		
		if(node1 != null && node2 != null)
		{
			return true;
		}
		if(node1 != null || node2 != null)
		{
			return false;
		}
		
		return (node1.val == node2.val) && isMirror(node1.left,node2.right) && isMirror(node1.right, node2.left);
		
		/*
		 * if(left==null || right==null)
        return left==right;
    if(left.val!=right.val)
        return false;
    return isSymmetricHelp(left.left, right.right) && isSymmetricHelp(left.right, right.left);
		 */
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
