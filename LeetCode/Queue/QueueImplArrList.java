import java.util.ArrayList;
import java.util.List;

public class QueueImplArrList {
	
	
	private List<Integer> data;
	private int p_start;
	
	public QueueImplArrList()
	{
		data = new ArrayList<>();
		p_start = 0;
		
	}
	
	public boolean enQueue(int x) {
		
		data.add(x);
		return true;
	}
	
	public boolean deQueue() {
		
		if(isEmpty() == true)
			return false;
		p_start++;
		return true;
	}
	
	public boolean isEmpty() {
		
		return p_start >= data.size();
	}
	
	public int getFront() {
		
		return data.get(p_start);
	}
	
    public static void main(String[] args) {
        QueueImplArrList q = new QueueImplArrList();
        q.enQueue(5);
        q.enQueue(3);
        if (q.isEmpty() == false) {
            System.out.println("First::"+q.getFront());
        }
        q.deQueue();
        if (q.isEmpty() == false) {
            System.out.println("Second::"+q.getFront());
        }
        q.deQueue();
        if (q.isEmpty() == false) {
            System.out.println("Third::"+q.getFront());
        }
    }

}
