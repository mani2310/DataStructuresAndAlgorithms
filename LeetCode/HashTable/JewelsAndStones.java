import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class JewelsAndStones {
	
	
	
	public static int numJewelsInStones(String J, String S) {
		
		char[] c1 = J.toCharArray();
		char[] c2 = S.toCharArray();
		int count =0;
		
		Set<Character> hs = new HashSet<Character>();
		
		for(char c: c1)
		{
			hs.add(c);
		}
		
		
		for(char c: c2)
		{
			if(hs.contains(c))
				count++;
		}
		
		return count;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String J = "aA";
		String S = "aAbbbAc";
		
		System.out.println(numJewelsInStones(J,S));

	}

}
