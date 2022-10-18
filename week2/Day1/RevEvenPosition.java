package week2.Day1;

public class RevEvenPosition {
	public static void main(String[] args)
	{
		String Name="I am a software tester";
		String[] Array=Name.split(" ");
		for(int i=0;i<Array.length;i++) 
		{
			//System.out.print(Array[i]);
			if(i%2==1) 
			{
				String Add="";
				Add=Add+Array[i];
				char[] RevStr=Add.toCharArray();
				for(int j=RevStr.length-1;j>=0;j--) {
					System.out.print(RevStr[j]);
				}
				
				
			}
			else {
				System.out.print(Array[i]);
			}
		}
	}
}
