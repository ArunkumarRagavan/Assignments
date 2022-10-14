package week1.Day4;

public class DuplicateNum {
	public static void main(String[] args) 
	{
		int[] Num= {14,12,13,11,15,18,16,17,14,19,18,17,20};
		int sum=Num.length;
		for(int i=0;i<sum;i++)
			for (int j =i+1; j <sum; j++) 
			{
				if( Num[i]==Num[j]) {
					System.out.println(Num[i]);
					
				}
			}
	}

}
