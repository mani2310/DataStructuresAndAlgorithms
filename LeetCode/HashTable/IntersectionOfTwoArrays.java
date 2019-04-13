import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntersectionOfTwoArrays {

public static int[] intersection(int[] nums1,int[] nums2) {
		
		//Since there is a concern for space complexity 
	
		//O(n) complexity 
		
		/*Set<Integer> hSet = new HashSet<Integer>();	
		List<Integer> list = new ArrayList<>();
		
		for(int i:nums1)
		{
			hSet.add(i);
		}
		
		for(int j:nums2)
		{
			if(!hSet.add(j))
				list.add(j);
		}
		
		int[] result = new int[list.size()];
		
		
		for(int i=0;i<list.size();i++)
			{
				result[i] = list.get(i);
			}
		
		return result;*/
	
	///Using binary Search
	
	Set<Integer> hSet = new HashSet<Integer>();	
	Arrays.sort(nums2);
	for(Integer num : nums1)
	{
		if(binarySearch(nums2,num))
			hSet.add(num);
	}
	
	int[] result = new int[hSet.size()];
	int i=0;
	for(Integer num : hSet)
	{
		result[i++] = num;
	}
	
	return result;	
		
}


public static boolean binarySearch(int[] nums,int target) {
	
	int low =0;
	int high = nums.length -1;
	
	while(low <= high)
	{
		int mid = low + (high - low)/2;
		
		if(nums[mid] == target)
		{
			return true;
		}
		
		else if(nums[mid] > target)
		{
			high = mid-1;
		}
		else
			{
				high = mid +1;
			}
		
	}
	return false;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums1 = {4,9,5};
		int[] nums2 = {9,4,9,8,4};
		
		//int[] nums1 = {1,2,2,1};
		//int[] nums2 = {2,2};
		
		int[] res=intersection(nums1,nums2);
		
		for(int i=0;i<res.length;i++)
		{
			System.out.println(res[i]);
		}
	
		
	}

}
