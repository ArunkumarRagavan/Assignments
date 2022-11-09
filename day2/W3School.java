package week5.day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class W3School {
	public static void main(String[] args)	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().window().maximize();
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Alert promtAlert=driver.switchTo().alert();
		promtAlert.sendKeys("arun");
		promtAlert.accept();
		String name=driver.findElement(By.id("demo")).getText();
		System.out.println(name);

}
}
