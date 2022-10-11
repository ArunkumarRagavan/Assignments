package week1.assignment2;

public class Mobile {
	String mobilebrandName="Redmi";
	char mobilelogo='m';
	short noofMobilePiece=1;
	int modelno=20164;
	long mobileImeiNumber=867877007545L;
	boolean mobileDamaged=false;
	float mobilePrice=6999.000F;
	public static void main(String[] args) {
		Mobile phone=new Mobile();
		System.out.println(phone.mobilebrandName);
		System.out.println(phone.mobilelogo);
		System.out.println(phone.noofMobilePiece);
		System.out.println(phone.modelno);
		System.out.println(phone.mobileImeiNumber);
		System.out.println(phone.mobileDamaged);
		System.out.println(phone.mobilePrice);
	}
}
