import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class DuplicateSubtrees {
	
	//using DFS algo::
	// Time Complexity::O(N2)
	// Space Complexity ::O(N2)
	class TreeNode
	{
		TreeNode left;
		TreeNode right;
		int val;
	}
	
	int t;
	Map<Integer,Integer> trees;
	Map<String,Integer> count;// = new HashMap<String,Integer>();
	List<TreeNode> ans;
	
	public List<TreeNode> findDuplicates(TreeNode root) {
		
		t=1;
		trees = new HashMap<>();
		ans = new ArrayList<>();
		count = new HashMap<>();
		helper(root);
		
		return ans;
		
	}
	
	public String helper(TreeNode node) {
		
		if(node == null)
			return "#";
		
		String serial = node.val +"," + helper(node.left)+","+helper(node.right);
		count.put(serial, count.getOrDefault(serial, 0)+1);
		
		if(count.get(serial) == 2)
			ans.add(node);
		return serial;
		
		
	}


	//Approach 2: Unique Identifier
	// Time Complexity::O(N)
	// Space Complexity ::O(N)
	
public int helper2(TreeNode node) {
		
		if(node == null)
			return 0;
		
		String serial = node.val +"," + helper(node.left)+","+helper(node.right);
		
		int uid = count.computeIfAbsent(serial, x->t++);
		trees.put(uid, count.getOrDefault(uid, 0)+1);
		
		if(count.get(uid) == 2)
			ans.add(node);
		return uid;
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
