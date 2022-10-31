package testNotes;

public class MissingElement {
	public static void main(String[] args)
	{
	int[] num= {1,2,3,5,6,8};
	for(int i=0;i<num.length-1;i++)
	   if(num[i]+1!=num[i+1]) {
		   System.out.println(num[i]+1);
		   
	   }
			
	}
}
