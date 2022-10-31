package testNotes;

import java.util.Arrays;

public class Ascending {
	public static void main(String[] args)
	{
		/*for(int i=1;i<=10;i++) {
			System.out.println(i);
		}*/
		// another method 
		int[] num= {1,5,2,3,4,6,7,9,8,10};
		Arrays.sort(num);
		for(int i=0;i<num.length;i++) {
		System.out.println(num[i]);
		}
	}

}
