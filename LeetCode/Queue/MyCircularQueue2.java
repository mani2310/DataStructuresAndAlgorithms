
public class MyCircularQueue2 {
	
	
	private int[] data;
    private int head;
    private int tail;
    private int size;
	
	
	
	public MyCircularQueue2(int k) {
		// TODO Auto-generated constructor stub
		data = new int[k];
		head = -1;
		tail = -1;
		size = k;
	}
	
	public boolean enQueue(int val) {
		// TODO Auto-generated method stub
		
		if(isFull())
			return false;
		if(isEmpty())
			head = 0;
		
		tail = (tail+1) % data.length;
		data[tail] = val;
		return true;

	}

	
	public boolean deQueue() {
		// TODO Auto-generated method stub
		
		if(isEmpty())
			return false;
		if(head == tail)
		{
			head = -1;
			tail =-1;
			return true;
		}
		head = (head +1) % size;
		return true;
	}

	public boolean isFull() {
		// TODO Auto-generated method stub
		
		return ((tail +1) % size) == head;
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return head ==-1;
	}

	public int Rear() {
		// TODO Auto-generated method stub
		return isEmpty() ?-1:  data[tail];
	}


	public int Front() {
		// TODO Auto-generated method stub
		return isEmpty() ? -1 : data[head];
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int val = 6;
		
		 MyCircularQueue2 circularQueue = new MyCircularQueue2(3);
		 circularQueue.enQueue(1);  // return true
		 circularQueue.enQueue(2);  // return true
		 circularQueue.enQueue(3);  // return true
		 circularQueue.enQueue(4);  // return false, the queue is full
		System.out.println(circularQueue.Rear());  // return 3
		 System.out.println(circularQueue.isFull());  // return true
		 System.out.println(circularQueue.deQueue());  // return true
		 circularQueue.enQueue(4);  // return true
		 System.out.println(circularQueue.Rear());  // return 4
		 System.out.println(circularQueue.Front());  // return 2
		

	}

}
