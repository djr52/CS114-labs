package lab_1;

public class Summation {

	public static void main(String[] args) {
		System.out.println(sumRec(10));
		

	}
	public static int sumRec(int x) {
	
		if (x==1) {
			return 1;
			
		}
		return x + sumRec(x-1);
		
	}

}
