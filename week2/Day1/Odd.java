package week2.Day1;

public class Odd {
	public static void main(String[] args)
	{
		String Word="changeme";
		//String StrCopy="";
		char[] Letter=Word.toCharArray();
		int Length=Letter.length;
		for(int i=0;i<Length;i++) {
			
			if(i%2!=0) {
				String strcpy="";
				strcpy=strcpy+Letter[i];
				
				System.out.print(strcpy.toUpperCase());			
			}
			
			else 
			{
				System.out.print(Letter[i]);
			}
			
			
		}
	}

}
