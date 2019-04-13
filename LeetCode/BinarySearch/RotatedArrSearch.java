
public class RotatedArrSearch {
	
	
	
	public static int search(int nums[], int n, int target) {
		
		int lo=0, hi = nums.length-1;
		
		while(lo < hi)
		{
			int mid = (lo+hi)/2;
			if(nums[mid] > nums[hi])
				lo = mid+1;
			else
				hi = mid;
		}
		
		int rot = lo;
		lo=0;hi = n-1;
		
		while(lo <= hi)
		{
			int mid = (lo+hi)/2;
			
			int realMid = (mid+rot)%n;
			if(nums[realMid] == target)
				return realMid;
			if(nums[realMid] < target)
				lo = mid+1;
			else
				hi = mid -1;
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
