package week1.Day4;

import java.util.Arrays;

public class MissingElement
{
	public static void main(String[] args)
	{
	int[] Num= {1,2,3,4,7,6,8,10};
	
	int Sum=Num.length;
	int c;
	
	Arrays.sort(Num);
	for(int i=0;i<Sum;i++)
	{
		c=i+1;
		if(c!=Num[i]) 
		{
			System.out.println(c);
			break;
		}
	}
	}
}
