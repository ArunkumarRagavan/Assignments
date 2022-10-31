package testNotes;

import java.util.Arrays;

public class FindSecLargeNum {
	public static void main(String[] args) {
		int[] num= {1,2,3,10,9,20};
		Arrays.sort(num);
		System.out.println(num[num.length-2]);
	}

}
