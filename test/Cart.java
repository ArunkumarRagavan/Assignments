package week7.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Cart {
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("input-username")).sendKeys("arun");
		driver.findElement(By.id("input-firstname")).sendKeys("arunkumar");
		driver.findElement(By.id("input-lastname")).sendKeys("ragav");
		driver.findElement(By.id("input-email")).sendKeys("arun2499@gmail.com");
		
		WebElement s1=driver.findElement(By.id("input-country"));
		Select v1=new Select(s1);
		v1.selectByValue("99");
		
		driver.findElement(By.id("input-password")).sendKeys("arun24@");

	}

}
