
public class SearchTarget {
	
	public static int search(int[] nums, int target) {
	
		int left =0;
		int right = nums.length -1;
		
		
		
		while(left <= right)
		{
			//int mid = (left + right) >>> 1;
			 // Prevent (left + right) overflow
		    int mid = left + (right - left) / 2;
			if(nums[mid] == target)
				return mid;
			else if(target > nums[mid])
				left = mid+1;
			else
				right = mid -1;
		}
		return -1;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num = {0,1,2,3,7,9};
		
		System.out.println(search(num, 9));
		
		

	}

}
