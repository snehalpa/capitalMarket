package Capitalmarket;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","E:\\Browsers\\chromedriver.exe");
		
		WebDriver d= new ChromeDriver();
		d.get("http://www.google.com");
		d.manage().window().maximize();
		Thread.sleep(5000);
		d.findElement(By.name("q")).sendKeys("testing");
		Thread.sleep(5000);
		
		
		
		

	}

}
