
public class SumOfDigits {
	
	public static int sum(int n) {
		
		if(n/10 == 0)
			return n;
		//int d = n/10;
		//int r = n%10;
		return n%10 + sum(n/10);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(sum(2392));

	}

}
