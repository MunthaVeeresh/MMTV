package MMTV;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MMTVProject {

	private static Object[] arguments;
	private static Duration timeOutInSeconds;

	public static void main(String[] args) throws Exception{
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
		RemoteWebDriver driver = new ChromeDriver(options); 
		driver.get("https://www.sunnxt.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//img[@alt='myaccount']/parent::div")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='header_myaccount__XYM8A']//div/img[@alt='myaccount']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='header_dropdown_myaccount__MOK2h']/div/ul/a/li[text()='Sign In']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@placeholder='Email / Mobile']")).sendKeys("9345774154");
		driver.findElement(By.name("password")).sendKeys("123456");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='LOG IN ']")).click();
		Thread.sleep(5000);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Select ']/parent::div")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//img[@alt='myaccount'])[1]")).click();
		driver.findElement(By.xpath("//img[@alt='profile']/parent::li")).click();
		//go to login page
//		driver.findElement(By.xpath("//img[@alt='profile']/parent::div")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("8328089512");
//		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
////		driver.findElement(By.xpath("//button[@type='submit']")).click();
////		JavascriptExecutor jse = (JavascriptExecutor)driver;
//		
//		WebElement	Ele = driver.findElement(By.xpath("//button[@type='submit']"));
//		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", Ele);
//	//	jse.executeScript("scroll(0, 250)"); // if the element is on bottom
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//button[@type='submit']")).click();

//		WebElement element = driver.findElement(By.xpath("//button[text()='Sign in']/parent::div"));
//		Actions actions = new Actions(driver);
//		actions.moveToElement(element).click().perform();
		//WebDriverWait wait=new WebDriverWait(driver, 20);
		//driver  = (RemoteWebDriver) wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
		

		
		
		
	   
		
		
	}

}
