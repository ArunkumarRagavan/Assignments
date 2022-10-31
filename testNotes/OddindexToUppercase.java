package testNotes;

public class OddindexToUppercase {
	public static void main(String[] args) {
		String word="arunkumar";
		char[] let=word.toCharArray();
		for(int i=0;i<=let.length;i++) {
			if(i%2==0) {
				String temp="";
				temp=temp+let[i];
				System.out.println(temp.toUpperCase());
			}
			else {
				System.out.println(let[i]);
			}
			
		}
	}

}
