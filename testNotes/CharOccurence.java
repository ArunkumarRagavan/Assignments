package testNotes;

public class CharOccurence 
{
	public static void main(String[] args)
	{
		
	String Words="welcome to chennai";
	int count=0;
	char[] Array=Words.toCharArray();
	for(int j=0;j<Array.length;j++)
		{
			if(Array[j]=='e') 
			{
				System.out.print(Array[j]);
				count++;
			}
				
		}
	System.out.println(count);
	

		
	}
	
	
}

