import java.util.HashMap;

public class TwoSum {
	
	
	public static int[] twoSum(int[] numbers, int target) {
		
		HashMap<Integer,Integer> hmap = new HashMap<Integer,Integer>();
		
		int[] result = new int[2];
	    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	    for (int i = 0; i < numbers.length; i++) {
	        if (map.containsKey(target - numbers[i])) {
	            result[1] = i + 1;
	            result[0] = map.get(target - numbers[i]);
	            return result;
	        }
	        map.put(numbers[i], i + 1);
	    }
	    return result;
		
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {2,4,6,0,1,7};
		
		int[] result = twoSum(nums, 9);

		
		for(int i=0;i<result.length;i++)
		{
			System.out.println(i);
		}
	}

}
