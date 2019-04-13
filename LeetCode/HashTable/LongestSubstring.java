import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
	
	
	public static int lengthOfLongestSubstring(String s) {
        
		int i=0,j=0,max=0;
		if(s.length() ==0)
			return 0;
		
		Set<Character> hs = new HashSet<>();
		
		while(j<s.length())
		{
			if(!hs.contains(s.charAt(j)))
			{
				hs.add(s.charAt(j++));
				max = Math.max(max, hs.size());
			}
			else
			{
				hs.remove(s.charAt(i++));
			}
				
		}
		return max;
		
		
    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(lengthOfLongestSubstring("bbbb"));

	}

}
