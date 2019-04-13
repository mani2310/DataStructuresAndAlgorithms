import java.util.Stack;

public class ValidParantheses {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "[[(){}]]";

		Stack<Character> stack = new Stack<Character>();
		for (char c : s.toCharArray()) {
			if (c == '(')
				stack.push(')');
			else if (c == '{')
				stack.push('}');
			else if (c == '[')
				stack.push(']');
			else if (stack.isEmpty() || stack.pop() != c)
				//return false;
				System.out.println("false");
		}
		//return stack.isEmpty();
		System.out.println(stack.isEmpty());
	}

}
