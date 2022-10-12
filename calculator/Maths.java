package calculator;

public class Maths {
	public void addTwoNumber(int a, int b) {
		int c=a+b;
		System.out.println(c);
	}
	public void subTwoNumber(int a, int b) {
		int c=a-b;
		System.out.println(c);
	}
	public void multiplyTwoNumber(double a, double b) {
		double c=a*b;
		System.out.println(c);
	}
	public void divideTwoNumber(float a, float b) {
		float c=a%b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		Maths sum=new Maths();
		sum.addTwoNumber(11, 13);
		sum.subTwoNumber(100,80 );
		sum.multiplyTwoNumber(101.23,22.556);
		sum.divideTwoNumber(10.5f,5.2f);
	}

}
