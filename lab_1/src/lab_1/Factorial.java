package lab_1;

public class Factorial {

	public static void main(String[] args) {
		System.out.println(calcFactorial(5));
		

	}
	public static int calcFactorial(int fact) { // Calculates factorial recursively
		if(fact == 0 || fact == 1) {
			
			return 1;
		}
		return fact * calcFactorial(fact - 1);
		
		
		
	}

}
