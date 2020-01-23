package lab_1;

public class Power {

	public static void main(String[] args) {
		System.out.println(powerOf(3, 2));
		System.out.println(powerOf(5, 3));
		
		

	}
	
	public static int powerOf(int x, int n) {
		if( n == 0) {
			return 1;
			
		}
		return x * powerOf(x, n-1);
		
	}

}
