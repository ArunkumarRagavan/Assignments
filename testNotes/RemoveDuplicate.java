package testNotes;


public class RemoveDuplicate
{
	public static void main(String[] args)
	{
		String words="I am a am student";
	   String[] key= words.split(" ");
	   
	    for(int i=0;i<key.length;i++)
	    {
	    for(int j=i+1;j<key.length;j++)
	    {
	    	if(key[i].equals(key[j])) {
	    		 key[j]="";
	    		
	    	}
	    	
	    }System.out.print(" "+key[i]);
		
	    }
	}
}


