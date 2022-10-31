package testNotes;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String word1="STOP";
		String word2="POST";
	    char[] new1=word1.toCharArray();
	    char[] new2=word2.toCharArray();
	    if(new1.length==new2.length)
	    {
	    	Arrays.sort(new1);
	    	Arrays.sort(new2);
	    	if(Arrays.equals(new1,new2))    //IMPORTANT STEP
	    	{
	    		System.out.println("Anagram");
	    	}
	    	else {
	    		System.out.println("Not Anagram");
	    	}		
	    	
	    }
	    else {
	    	System.out.println("given strings are differ");
	    }
	
		
	}

}
