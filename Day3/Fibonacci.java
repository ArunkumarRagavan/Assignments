package week1.Day3;

public class Fibonacci {
	public static void main(String[] args)
	{
		int a=0,b=1,c=1;
		for(int i=0;i<=10; i++)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
		
			
	}

}
