package testNotes;

public class Palindrome {
	public static void main(String[] args)
	{
		String name="MADAM",Rev="";
		
		char[] value=name.toCharArray();
		for(int i=value.length-1;i>=0;i--)
		{
			Rev=Rev+value[i];
		}
		System.out.println(Rev);
		if(Rev.equals(name)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("Not palindrome");
		}
	}
	

}
