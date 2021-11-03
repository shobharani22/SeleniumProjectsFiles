package selenium.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project1 {
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "/Users/shobhbs/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.geeksforgeeks.org");
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.findElement(By.partialLinkText("Sign In")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.cssSelector("label[for=tab2]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("input[name=email]")).sendKeys("abcd@gmail.com");
		Thread.sleep(1000);
		
		driver.findElement(By.id("reg-password")).sendKeys("1234");
		Thread.sleep(1000);
		
		driver.findElement(By.id("organization")).sendKeys("simplilearn");
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("label[for=tab1]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("luser")).sendKeys("abcd@gmail.com");
		Thread.sleep(1000);
		
		driver.findElement(By.id("password")).sendKeys("1234");
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("button[type=submit]")).click();
		Thread.sleep(1000);
		
		driver.close(); 
		
	}

}
