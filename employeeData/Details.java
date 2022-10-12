package employeeData;

public class Details {
	public void NameandId() {
		String empName="Arun";
		int id=2410;
		System.out.print(empName);
		System.out.println(id);
	}
	public void Address() {
		String address="saint thomasmount";
		System.out.println(address);
	}
	public void Salary() {
		double amount=24000.788;
		System.out.println(amount);
	}
	public void mobileNo() {
		long phoneno=7094004210l;
		System.out.println(phoneno);
		}
	public static void main(String[] args){
	Details data=new Details();
	data.NameandId();
	data.Address();
	data.Salary();
	data.mobileNo();
	}
}
