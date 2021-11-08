package testNgprojects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {
	public WebDriver driver;



	@Test
	public void ChromeTestMethod() throws InterruptedException 
	{ 

		System.out.println("starting");
		System.setProperty("webdriver.chrome.driver", "/Users/shobhbs/chromedriver");
		driver = new ChromeDriver();

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
		driver.findElement(By.cssSelector("#Register > button")).click();
		Thread.sleep(3000);
		System.out.println("registration done");
		driver.findElement(By.cssSelector("label[for=tab1]")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("luser")).sendKeys("abcd@gmail.com");
		Thread.sleep(1000);

		driver.findElement(By.id("password")).sendKeys("1234");
		Thread.sleep(1000);

		driver.findElement(By.cssSelector("button[type=submit]")).click();
		Thread.sleep(1000);
		System.out.println("logged in");
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.get("https://amazon.in/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("watch");
		Thread.sleep(2000);
		System.out.println("searching");
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(2000);
		System.out.println("fetching the link ");
		
		WebElement option1 = driver.findElement(By.linkText("TIMEX"));
		option1.click();
		Thread.sleep(2000);
		
		driver.findElement(By.partialLinkText("Analog Blue Dial Men's Watch-TW00ZR262E")).click();
		Thread.sleep(2000);
		System.out.println("completed");
		driver.close(); 
	}






}
