package week2.Ass4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Cart {
	public static void main(String[] args)	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		driver.manage().window().maximize();
		driver.findElement(By.id("input-username")).sendKeys("Arun");
		driver.findElement(By.id("input-firstname")).sendKeys("Arunkumar");
		driver.findElement(By.id("input-lastname")).sendKeys("Ragav");
		driver.findElement(By.id("input-email")).sendKeys("arun241099@gmail.com");
		WebElement country=driver.findElement(By.id("input-country"));
		Select c1= new Select(country);
		c1.selectByValue("99");
		driver.findElement(By.id("input-password")).sendKeys("Arun241099@");
		driver.findElement(By.xpath("//*[@id=\"button-register\"]/button[1]")).click();

}
}