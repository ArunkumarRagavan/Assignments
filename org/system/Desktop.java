package org.system;

public class Desktop extends Computer
{
	public void desktopSize()
	{
		System.out.println("Size 15.1 inch");
	}
	public static void main(String[] args) {
		Desktop model=new Desktop();
		model.computerModel();
		model.desktopSize();
	}
}
