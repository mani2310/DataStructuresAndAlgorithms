import java.util.HashMap;

public class IsoMorphicStrings {
	
	public static boolean isIsomorphic(String s,String t) {
		
		if(s==null || s.length() <=1)
			return true;
		
		HashMap<Character, Character> hMap = new HashMap<>();
		
		
		for (int i = 0; i < s.length(); i++) {
			
			char a = s.charAt(i);
			char b = t.charAt(i);
			
			if(hMap.containsKey(a))
			{
				if (hMap.get(a).equals(b)) {
					continue;
				}
				else
				{
					return false;
				}
			}
			else
			{
				if(!hMap.containsValue(b))
					hMap.put(a, b);
				else
					return false;
			}
		}
		return true;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
