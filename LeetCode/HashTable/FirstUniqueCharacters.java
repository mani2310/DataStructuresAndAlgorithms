
public class FirstUniqueCharacters {
	
	    public int firstUniqChar(String s) {
	        
	        
	        /*
	        int[] charCount = new int[26];
	        char[] chars = s.toCharArray();
	        for( char c : chars ) charCount[c-'a']++;
	        for( int i=0; i<chars.length; i++ ) if( charCount[chars[i]-'a']==1 ) return i;
	        return -1;
	        */
	        int[] charCount = new int[26];
	        char[] carr = s.toCharArray();
	        
	        for(char c : carr)
	        {
	            charCount[c-'a']++;
	        }
	        
	        for(int i=0;i<carr.length;i++)
	        {
	             if(charCount[carr[i] - 'a'] == 1)
	             {
	                 return i;
	             } 
	        } 
	        return -1;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
