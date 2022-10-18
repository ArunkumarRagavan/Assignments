package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Web {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("ahgdhg");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("ak");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("arun");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("kumar");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("sales");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("productsales");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("arun24@gmail.com");
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.className("subMenuButton")).click();
		driver.findElement(By.name("description")).clear();
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("aehhjengjd");
		driver.findElement(By.name("submitButton")).click();
		}

}
