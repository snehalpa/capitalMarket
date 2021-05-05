package Capitalmarket;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Browsers\\chromedriver.exe");
		// TODO Auto-generated method stub
		WebDriver d= new ChromeDriver();
		d.get("http://www.google.com");
		d.manage().window().maximize();
		Thread.sleep(5000);
		d.findElement(By.name("q")).sendKeys("JAVA");
		d.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		List<WebElement> list=d.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='LaCQgf']"));
		System.out.println(list.size());
	

		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().contains("java tutorial")) {
				list.get(i).click();
				break;
				
			}
		}
		

	}

}
