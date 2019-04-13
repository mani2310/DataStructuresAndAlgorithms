import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicates {
	
    public static boolean containsDuplicate(int[] nums) {
        
    	 Set<Integer> hs = new HashSet<Integer>();
        for(int i : nums)
        {
            if(!hs.add(i))
                return true;
        }
        return false;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {2,3,4,5,7,6,0};
		
		System.out.println(containsDuplicate(nums));

	}

}
