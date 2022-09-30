package app.dsa;

public class countRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count = countDigits(99999);
		System.out.println(count);

	}
	
	public static int countDigits (int n) {
		if(n == 0)
			return 1;
		int i = countDigits(n/10);
		i++;
		//System.out.println(i);
		return i;
		
	}

}
