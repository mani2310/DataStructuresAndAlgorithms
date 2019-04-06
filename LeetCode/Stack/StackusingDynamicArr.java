import java.util.ArrayList;
import java.util.List;

public class StackusingDynamicArr {

	private List<Integer> data;
	
	public StackusingDynamicArr() {
		// TODO Auto-generated constructor stub
		data = new ArrayList<>();
	}
	
	public void push(int x) {
		data.add(x);
	}
	
	public boolean pop() {
		if(!isEmpty())
		{
			data.remove(data.size() -1);
			return true;
		}
		else
			return false;
			
	}
	
	public boolean isEmpty() {
		
		return data.isEmpty();
	}
	
	public int top() {
		
		return data.get(data.size() -1); 
			
	}
	
	public static void main(String[] args) {
        StackusingDynamicArr s = new StackusingDynamicArr();
        s.push(1);
        s.push(2);
        s.push(3);
        for (int i = 0; i < 4; ++i) {
            if (!s.isEmpty()) {
                System.out.println(s.top());
            }
            System.out.println(s.pop());
        }
    }

}
