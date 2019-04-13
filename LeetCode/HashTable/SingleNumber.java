

public class SingleNumber {

	public static int singleNumber(int[] nums) {
		
		//Since there is a concern for space complexity 
		
		int result =0;
		
		for(int i:nums)
		{
			result ^=i;
		}
        
		return result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {2,2,2,2,2,2,1};
		System.out.println(singleNumber(nums));
	}

}
