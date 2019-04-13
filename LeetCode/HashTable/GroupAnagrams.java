import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


//O(NK)
public class GroupAnagrams {
	
	
	//solution::2
	/*
	 * class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) return new ArrayList();
        Map<String, List> ans = new HashMap<String, List>();
        int[] count = new int[26];
        for (String s : strs) {
            Arrays.fill(count, 0);
            for (char c : s.toCharArray()) count[c - 'a']++;

            StringBuilder sb = new StringBuilder("");
            for (int i = 0; i < 26; i++) {
                sb.append('#');
                sb.append(count[i]);
            }
            String key = sb.toString();
            if (!ans.containsKey(key)) ans.put(key, new ArrayList());
            ans.get(key).add(s);
        }
        return new ArrayList(ans.values());
    }
}
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	public static List<List<String>> groupAnagrams(String[] strs) {
		
		
		if(strs == null || strs.length ==0)
			return new ArrayList<List<String>>();
		
		Map<String, List<String>> map = new HashMap<String,List<String>>();
		
		for(String s : strs)
		{
			char[] ca = s.toCharArray();
			
			Arrays.sort(ca);//O(KlogK) time
			
			String keyStr = String.valueOf(ca);
			
			if(!map.containsKey(keyStr))
				map.put(keyStr, new ArrayList<String>());
			
			map.get(keyStr).add(s);
			
		}
		
		return new ArrayList<List<String>>(map.values());
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
