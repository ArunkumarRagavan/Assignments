package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class bank {
	public static void main(String[] args)	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://uibank.uipath.com/register-account");
		driver.manage().window().maximize();
		driver.findElement(By.id("firstName")).sendKeys("arun");
		WebElement d1=driver.findElement(By.id("title"));
		Select v1=new Select(d1);
		v1.selectByVisibleText("Mrs");
		driver.findElement(By.id("middleName")).sendKeys("kumar");
		driver.findElement(By.id("lastName")).sendKeys("Ragav");
		WebElement d2=driver.findElement(By.id("sex"));
		Select v2=new Select(d2);
		v2.selectByVisibleText("Male");
		WebElement d3=driver.findElement(By.id("employmentStatus"));
		Select v3=new Select(d3);
		v3.selectByVisibleText("Full-time");
		driver.findElement(By.id("age")).sendKeys("10/24/1999");
		WebElement ma1= driver.findElement(By.id("maritalStatus"));
		Select ms=new Select(ma1);
		ms.selectByVisibleText("Single");
		driver.findElement(By.id("numberOfDependents")).sendKeys("2");
		driver.findElement(By.id("username")).sendKeys("ArunRagav");
		driver.findElement(By.id("email")).sendKeys("arun241099@gmail.com");
		driver.findElement(By.id("password")).sendKeys("arun24");
		

}
}