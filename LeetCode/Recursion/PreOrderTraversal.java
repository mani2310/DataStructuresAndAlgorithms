import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


public class PreOrderTraversal {
	
	public class TreeNode {
		      int val;
		     TreeNode left;
		     TreeNode right;
		    TreeNode(int x) { val = x; }
		 }

	public static List<Integer> preOrderTraversal(TreeNode root) {
		
		List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            while(node != null){
                list.add(node.val);
                stack.push(node.right);
                node = node.left;
            }            
        }
        return list;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
