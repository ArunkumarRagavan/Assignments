package week7.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Rail {
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		
		WebElement v1=driver.findElement(By.id("txtStationFrom"));
		v1.clear();
		v1.sendKeys("madurai jn"+Keys.TAB);
		
		WebElement v2=driver.findElement(By.id("txtStationTo"));
		v2.clear();
		v2.sendKeys("rjpm"+Keys.TAB);
		
		driver.findElement(By.xpath("(//input[@type='button'])[2]")).click();
		driver.findElement(By.xpath("(//td[text()='23'])[1]")).click();
		
		List<WebElement> ele = driver.findElements(By.xpath("//a[@title='Click on train number to View fare and schedule']"));
		for(WebElement n1:ele)
		{
			System.out.println(n1.getText());
		}
		
		
		

}
}