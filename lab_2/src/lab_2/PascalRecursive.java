package lab_2;

public class PascalRecursive {
	public static void main(String[] args) {
		
		final int NUM = 10;//How many levels in pascal's triangle
		
		for (int i = 1; i <= NUM; ++i)
	    {
	        int[] arr = RecPascal(i);
	        System.out.print((i < NUM ? " " : "") + i + ": ");
	        for (int j : arr)
	        {
	       	 	System.out.print(j + " ");
	        }
	        System.out.println();
	     }
		
		
	}
	public static int[] RecPascal(int x){
		if(x == 1)
		{
			return new int[] {1};
			
		}
		
		if(x == 2) 
		{
			return new int[] {1,1};
		}
		int[] tri = RecPascal(x - 1);
		
		int[] newTri = new int[tri.length + 1];
		
		newTri[0] = tri[0];
		newTri[newTri.length - 1] = tri[tri.length - 1];
		
		for(int i = 1; i < newTri.length; i++) 
		{
			if(newTri[i] == 0)
			{
				newTri[i] = tri[i-1] + tri[i];
			}
			
			
		}
		 
		return newTri;
		
		
		
		
	}

}
