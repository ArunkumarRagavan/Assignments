package week2.Day1;

public class Plaindrome 
{
	public static void main(String[] args)
	{
		String Name="MALAYALAM";
		String Rev="";
		char[] Array=Name.toCharArray();
		for(int i=Array.length-1;i>=0;i--)
		{
			System.out.print(Array[i]);
			Rev=Rev+ Array[i];
		}
		System.out.println(Rev);
		
		if(Rev.equals(Name)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("not a Palindrome");
			
		}
		
	}
		
}

