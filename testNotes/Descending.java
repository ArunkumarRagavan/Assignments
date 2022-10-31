package testNotes;

import java.util.Arrays;

public class Descending {
	public static void main(String[] args)
	{
		/*for(int i=10;i>0;i--) 
		  {
			System.out.println(i);
		}*/
		// another method 
		int[] num= {1,5,2,3,4,6,7,9,8,10};
		Arrays.sort(num);
		for(int i=num.length-1;i>=0;i--) {
		System.out.println(num[i]);
		}
	}


}
