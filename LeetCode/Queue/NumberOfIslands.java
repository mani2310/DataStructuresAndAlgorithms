
public class NumberOfIslands {
	
	private int m;
	private int n;
	
	public int numIslands(char[][] grid) {
		
		int count =0;
		n = grid.length;
		
		if(n==0)
			return 0;
		m=grid[0].length;
		
		for(int i=0;i<n;i++)
		{	for(int j=0;j<m;j++)
			{
				if(grid[i][j] == '1')
					{
						DSFMarking(grid,i,j);
						++count;
					}
					
			}
		}
		
		return count;
	}
	
	public void DSFMarking(char[][] grid, int i,int j) {
		
		if(i<0 || j<0 || i>=n || j>=m || grid[i][j] != '1')
			return;
		
		grid[i][j] ='0';
		
		DSFMarking(grid,i+1,j);
		DSFMarking(grid,i-1,j);
		DSFMarking(grid,i,j+1);
		DSFMarking(grid,i,j-1);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NumberOfIslands num = new NumberOfIslands();
		char[][] a = {
			      {'1','1','1','1','0'}, 
			      {'1','1','0','1','0'}, 
			      {'1','1','0','0','0'}, 
			      {'0','0','0','0','0'},
			};
		System.out.println(num.numIslands(a));

	}

}
