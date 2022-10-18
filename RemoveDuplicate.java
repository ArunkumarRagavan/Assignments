package week2.Day1;

public class RemoveDuplicate {
	public static void main(String[] args)
	{
		String Text="we learn java basics as a part java session in java week1";
	
		String[] Array=Text.split(" ");
		int Len=Array.length;
		for(int i=0;i<Len;i++) {
			for(int j=i+1;j<Len;j++)
			{
				
			if(Array[i].equals(Array[j]))
			{
				Array[j]="";
			}
			
				
			}
		
			System.out.print(" "+Array[i]);
	}

}}

