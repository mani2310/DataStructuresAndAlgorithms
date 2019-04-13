

public class PathSum {
	
	public class TreeNode
	{
		TreeNode left;
		TreeNode right;
		int val;
		
		TreeNode(int x) { val = x; }
	}
	
	public static boolean findSum(TreeNode root,int sum) {
		
		if(root == null)
			return false;
		return helper(root,sum,0);
	}
	
	public static boolean helper(TreeNode node,int sum,int cur) {
		
		if(node == null)
		{
			if(node.left == null && node.right == null)
				cur += node.val;
				if(cur == sum)
					return true;
		}
		else
		{
			return helper(node.left,sum,cur+node.val) || helper(node.right,sum,node.val);
		}
		
		return false;
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
