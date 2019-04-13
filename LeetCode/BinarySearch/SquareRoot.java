
public class SquareRoot {
	
	public static int sqrt(int x) {
		
		int left =1;
		int right = Integer.MAX_VALUE;
		
		if(x==0)
			return 0;
		
		while(true)
		{
			int mid = left + (right - left)/2;
			
			if(mid > x/mid)
				right = mid -1;
			else
			{
				if(mid + 1 > x/(mid+1))
					return mid;
				left = mid+1;
			}
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(sqrt(4));

	}

}
