package GmailAccount.GmailLogin;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Practice_Login {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		String path="..//GmailLogin/Drivers/chromedriver.exe";
		String url="https://mail.google.com";
		
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver=new ChromeDriver();
		
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("rk1253324@gmail.com");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		driver.findElement(By.name("password")).sendKeys("Sams#211");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		driver.findElement(By.xpath("//div[@class='z0']/div[@role='button']")).click();
		Thread.sleep(10000);
	
		driver.findElement(By.xpath("//input[@class='agP aFw']")).sendKeys("sujayaraveeti1997@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.name("subjectbox")).sendKeys("Hello");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='Am Al editable LW-avf tS-tW']")).sendKeys("Hello! This is a sample message");
		driver.findElement(By.id(":7u")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//img[@class='gb_Ba gbii']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Sign out']")).click();
		
		driver.close();
		
		
		
	
	
	}

	}
