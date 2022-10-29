package week2.Ass2;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fb {
	public static void main(String[] args)	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		driver.findElement(By.name("firstname")).sendKeys("Arun");
		driver.findElement(By.name("lastname")).sendKeys("kumar");
		driver.findElement(By.name("reg_email__")).sendKeys("7094755145");
		driver.findElement(By.id("password_step_input")).sendKeys("Arun2424");
		WebElement Date=driver.findElement(By.name("birthday_day"));
		Select d1= new Select(Date);
		d1.selectByVisibleText("24");
		WebElement Month=driver.findElement(By.name("birthday_month"));
		Select m1= new Select(Month);
		m1.selectByVisibleText("Oct");
		WebElement Year=driver.findElement(By.name("birthday_year"));
		Select y1= new Select(Year);
		y1.selectByVisibleText("1999");
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		
		

}
}