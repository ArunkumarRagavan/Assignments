package week7.test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nykaa {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement ele = driver.findElement(By.xpath("//a[text()='brands']"));
		
		Actions action=new Actions(driver);
		action.moveToElement(ele).perform();
		
		driver.findElement(By.xpath("(//a[contains(text(),'Paris')])[1]")).click();
		String title=driver.getTitle();
		System.out.println(title);
		if(title.contains("L'Oreal Paris"))
		{
			System.out.println("Title is same");
		}else {
			System.out.println("Title is not same");
		}
		
		driver.findElement(By.xpath("//span[@class='sort-name']")).click();
		driver.findElement(By.xpath("//div[@class='control-indicator radio active']")).click();
		driver.findElement(By.id("first-filter")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Hair']")).click();
		driver.findElement(By.xpath("//span[text()='Hair Care']")).click();
	    driver.findElement(By.xpath("(//div[@class='control-indicator checkbox '])[1]")).click();
	   
		driver.findElement(By.xpath("//span[text()='Concern']")).click();
		driver.findElement(By.xpath("(//div[@class='control-indicator checkbox '])[6]")).click();
		
		WebElement ele1=driver.findElement(By.className("css-1emjbq5"));
		String s2=ele1.getText();
		System.out.println(s2);
		if(s2.contains("Shampoo")) {
			System.out.println("filter applied");
		}else {
			System.out.println("filter not applied");
		}
		
		driver.findElement(By.xpath("(//div[@class='css-d5z3ro'])[1]")).click();
	
		Set<String> win = driver.getWindowHandles();
		System.out.println(win.size());
		List<String> openwin=new ArrayList<String>(win);
		driver.switchTo().window(openwin.get(1));
		
		WebElement ele2 = driver.findElement(By.xpath("//select[@class='css-2t5nwu']"));
		Select d1=new Select(ele2);
		d1.selectByValue("0");
		
		driver.findElement(By.xpath("(//button[@type='button'])[8]")).click();
		
		driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();//span[text()='₹240']
		
		driver.switchTo().frame(1);
		Thread.sleep(7000);
		WebElement findElement = driver.findElement(By.xpath("//span[text()='₹240']"));
		String value=findElement.getText();
		System.out.println(value);
		
		driver.findElement(By.xpath("//span[text()='Proceed']")).click();
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//button[text()='Continue as guest']")).click();
		
		driver.findElement(By.xpath("(//img[@alt='Image'])[7]")).click();
		
		String price2 = driver.findElement(By.xpath("//p[text()='₹240']")).getText();
		System.out.println(price2);
		
		if(price2.equals(value)) {
			System.out.println("Prices are same");
		} else {
			System.out.println("Prices are same");
		}
		
		

}
}