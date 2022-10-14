package week1.Day4;

public class FindIntersection {
	public static void main(String[] args) {
		int[] First= {3,2,11,4,6,7};
		int[] Second= {1,2,8,4,9,7};
		int Firstsum=First.length;
		int Secondsum=Second.length;
		for(int i=0;i<Firstsum;i++)
			for (int j = 0; j < Secondsum; j++) 
			{
				if( First[i]==Second[j]) {
					System.out.println(First[i]);
					
				}
			}
			
	}

}
