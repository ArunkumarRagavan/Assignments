package CarFunctions;

public class mycar {
	public void applyBrake() {
		System.out.println("apply brake");
	}
	public void applyGear() {
		System.out.println("apply gear");
	}
	public void applyAccelerate() {
		System.out.println("apply acclerate");
	}
	public void switchonAC() {
		System.out.println("switchon AC");
	}
	public static void main(String[] args) {
		mycar car=new mycar();
		car.applyBrake();
		car.applyGear();
		car.applyAccelerate();
		car.switchonAC();
	}

}
