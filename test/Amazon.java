package week7.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phones"+Keys.ENTER);
		List<WebElement> findElements = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		for(WebElement n1:findElements) {
			String value=n1.getText();
			System.out.print(value+" ");
			
		}
		
}
}