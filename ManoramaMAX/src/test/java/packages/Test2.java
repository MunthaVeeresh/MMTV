package packages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--disable-notifications");
		RemoteWebDriver driver = new ChromeDriver(options);
		driver.get("https://www.w3schools.com//");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/div/a[5]")).click();
//		JavascriptExecutor jse = (JavascriptExecutor)driver;
//		jse.executeScript("window.scrollBy(0,300)");
		driver.findElement(By.xpath("//h4[text()='Free Tutorials']")).click();
		//driver.findElement(By.xpath("//a[@title='Login to your account']")).click();
		driver.findElement(By.xpath("//a[text()='Sign Up']")).click();
		driver.findElement(By.xpath("//a[text()='Sign Up For Free']")).click();
//		driver.findElement(By.className("email")).sendKeys("munthaveeresh2000@gmail.com");
//		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("MVeeresh@123");
//		driver.findElement(By.xpath("//span[text()='Log in']")).click();
		Thread.sleep(3000);
	}

}
