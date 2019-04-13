
public class BinarySearchRecursive {
	
	
	public static int binarySearch(int[] n,int val,int left,int right) {
		
		int mid = (left + right)/2;
		
		if(left > right)
			return -1;
		
		if(n[mid] == val)
			return mid;
		else if(val < n[mid])
			return binarySearch(n, val, left, mid-1);
		else
			return binarySearch(n, val, mid + 1, right);
		
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers = { 10, 15, 24, 33, 37, 41, 44, 67, 96, 100};
        
        System.out.println("Position of 33 in this array is " + binarySearch(numbers,33,0,9));

	}

}
