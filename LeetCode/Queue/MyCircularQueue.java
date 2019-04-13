
public class MyCircularQueue {
	
	final int[] arr;
	int front,rear = -1,len =0;
	
	
	
	public MyCircularQueue(int k) {
		// TODO Auto-generated constructor stub
		arr = new int[k];
	}
	
	public boolean enQueue(int val) {
		// TODO Auto-generated method stub
		
		if(!isFull())
		{	rear = (rear+1) % arr.length;
			arr[rear] = val;
			len++;
			return true;
		}
		else
			return false;
	}

	
	public boolean deQueue() {
		// TODO Auto-generated method stub
		
		if(!isEmpty())
		{	front = (front +1) % arr.length;
			len--;
			return true;
		}
		else
			return false;
	}

	public boolean isFull() {
		// TODO Auto-generated method stub
		
		return len == arr.length;
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return len ==0;
	}

	public int Rear() {
		// TODO Auto-generated method stub
		return isEmpty() ?-1:  arr[rear];
	}


	public int Front() {
		// TODO Auto-generated method stub
		return isEmpty() ? -1 : arr[front];
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int val = 6;
		
		 MyCircularQueue circularQueue = new MyCircularQueue(3);
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
