package testNotes;

public class PrimeNumber
{
	public static void main(String[] args) 
	{
		int a=29,rem=1;
		for(int j=2;j<a;j++)
		{
			if(a%j==0)
			{
				 rem=0;
			}
		}

		if(rem==1) {
			System.out.println("prime");
		}
		else {
			System.out.println("Not prime");
		}
	}


}

