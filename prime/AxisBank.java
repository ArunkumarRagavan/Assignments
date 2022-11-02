package prime;

public class AxisBank extends BankInfo {
	public void deposit() {
		System.out.println("Deposit=25000");
	}
	public static void main(String[] args)
	{
		AxisBank amount=new AxisBank();
		amount.saving();
		amount.deposit();
		amount.fixed();
	}

}
