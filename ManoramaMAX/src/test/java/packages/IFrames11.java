package packages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IFrames11 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--disable-notifications");
		RemoteWebDriver driver = new ChromeDriver(options);
		driver.get("https://www.hyrtutorials.com/");
		Thread.sleep(5000);
		//driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.id("name")).sendKeys("Veeresh");
		Thread.sleep(5000);
		driver.switchTo().frame("frm1");
		Thread.sleep(5000);
		Select sc = new Select(driver.findElement(By.id("course")));
		sc.selectByVisibleText("Java");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("firstName")).sendKeys("muntha");
		Thread.sleep(5000);
		driver.switchTo().frame("frm2");
		Thread.sleep(5000);
		driver.findElement(By.id("name")).sendKeys("muntha veeresh");
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		driver.findElement(By.id("name")).sendKeys("Veeresh");
		Select sc1 = new Select(driver.findElement(By.id("course")));
		sc1.selectByVisibleText("Javascript"); 
		
	}
	

}
