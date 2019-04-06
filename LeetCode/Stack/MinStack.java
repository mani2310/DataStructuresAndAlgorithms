import java.util.Stack;

public class MinStack {
	
	private Stack<Integer> st = new Stack<Integer>();
	int min = Integer.MAX_VALUE;
	
	
	public void push(int x) {
		
		
		if(x <= min)
		{
			st.push(x);
			min =x;
		}
		st.push(x);
	}
	
	public void pop() {
		
		if(st.pop() == min)
			min = st.pop();
	}
	
	public int getTop() {
		
		return st.peek();
	}
	
	public int getMin() {
		
		return min;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinStack s = new MinStack();
        s.push(0);
        s.push(2);
        s.push(-3);
        s.push(3);
        s.push(-2);
        s.push(9);
        
        System.out.println(s.getMin());
	}

}
