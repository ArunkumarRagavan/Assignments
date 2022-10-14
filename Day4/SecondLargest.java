package week1.Day4;

import java.util.Arrays;

public class SecondLargest {
	public static void main(String[] args) {
	int[] Array= {3,2,11,4,6,7};
	int sum=Array.length;
	Arrays.sort(Array);
	System.out.println(Array[sum-2]);
	}
}