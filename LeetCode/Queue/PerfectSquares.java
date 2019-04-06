
public class PerfectSquares {
	
	private int minCount = Integer.MAX_VALUE;
	//private boolean found = false;
	public int numSquares(int n) {
		// n is positive
		int maxSquare = (int) Math.sqrt(n);
		int count=0;
		dfs(maxSquare,count,n);
//minCount will always be valid, because can be added with 1;
		return minCount;
	}

	private void dfs(int maxSquare, int count, int n) {
		if(n==0)
		{
			if(count < minCount) minCount = count;
			return;
		}
		if(n>0)
		for(int i=maxSquare;i>=1;i--)
		{
			count++;
			if(count<minCount)
			dfs((int)Math.sqrt(n-i*i),count,n-i*i);
			count--;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
