import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrder {
	
	class TreeNode
	{
		TreeNode left;
		TreeNode right;
		int val;
		
		TreeNode(int x) { val = x; }
	}
	
	public static  List<List<Integer>> levelOrder(TreeNode root) {
	
		List<List<Integer>> sol = new ArrayList<>();
		
		if(root == null)
			return sol;
		
		Queue<TreeNode> q = new LinkedList<>();
		
		q.add(root);
		TreeNode temp;
		
		while(q.size() !=0)
		{
			List<Integer> li = new ArrayList<>();
			
			int size = q.size();
			
			for (int i = 0; i < size; i++) {
			
				temp = q.poll();
				if(temp.left != null)
					q.add(temp.left);
				if(temp.right != null)
					q.add(temp.right);
				li.add(temp.val);
			}
			
			sol.add(li);
					
		}
		return sol;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
