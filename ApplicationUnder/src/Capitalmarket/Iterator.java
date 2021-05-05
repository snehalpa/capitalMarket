package Capitalmarket;

import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Iterator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","E:\\Browsers\\chromedriver.exe");
		
		WebDriver d= new ChromeDriver();
		d.get("http://www.google.com");
		d.manage().window().maximize();
		Thread.sleep(5000);
		d.findElement(By.name("q")).sendKeys("Software Testing");
		d.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		List<WebElement> suggesstion =d.findElements(By.className("erkvQe"));
		
		for(WebElement suggest: suggesstion) {
			if(suggest.getText().equalsIgnoreCase("software testing")) {
				suggest.click();
				break;
			}
			
		}
		
	
	}
}
		


