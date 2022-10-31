package testNotes;


public class ReverseEvenwords {
	public static void main(String[] args) {
		
	String words1="I am a student";
	String[] key=words1.split(" ");
	
	for(int i=0;i<key.length;i++) 
	{
		if(i%2!=0)
		
		{
			String rev1="";
			String fin="";
			rev1=rev1+key[i];
			char[] let=rev1.toCharArray();
			for(int j=let.length-1;j>=0;j--)
			{
				
				fin=fin+let[j];
			}
			System.out.print(fin);
		}
		else {
			System.out.print(" "+key[i]+" ");
		}
		
		
	}

}
}