
public class LeastCommonAncestor {
	
	class TreeNode{
		int val;
		
		TreeNode left;
		TreeNode right;
		public TreeNode(int x) {
			// TODO Auto-generated constructor stub
			this.val = x;
		}
	}
	
	public static TreeNode lowestCommonAncestor(TreeNode root,TreeNode p,TreeNode q) {
		
		
		if(root == null || root == p || root == q)
			return root;
		
		TreeNode left = lowestCommonAncestor(root.left, p, q);
		TreeNode right = lowestCommonAncestor(root.right, p, q);
		
		if(left != null && right != null)
			return root;
		return left != null ? left : right;
	}
	
	//OR
	/*public static TreeNode lowestCommonAncestor(TreeNode root,TreeNode p,TreeNode q) {
	  if (root.val < p.val && root.val < q.val) 
      {
          return lowestCommonAncestor(root.right, p, q); 
      }
      else if (root.val > p.val && root.val > q.val) 
      {
          return lowestCommonAncestor(root.left, p, q); 
      }
      else 
      {
          return root;
      }
	}*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
