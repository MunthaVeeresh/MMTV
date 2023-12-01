package packages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertBox9 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--disable-notifications");
		RemoteWebDriver driver = new ChromeDriver(options);
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)");
//		driver.findElement(By.id("alertBox")).click();
//		Thread.sleep(5000);
//		System.out.println(driver.switchTo().alert().getText());
//		Thread.sleep(5000);
//		driver.switchTo().alert().accept();
//		System.out.println(driver.findElement(By.id("output")).getText());
//		Thread.sleep(5000);
//		driver.findElement(By.id("confirmBox")).click();
//		Thread.sleep(5000);
//		System.out.println(driver.switchTo().alert().getText());
//		Thread.sleep(5000);
//		driver.switchTo().alert().dismiss();
//		Thread.sleep(5000);
//		System.out.println(driver.findElement(By.id("output")).getText());
//		Thread.sleep(5000);
//		driver.findElement(By.id("promptBox")).click();
//		Thread.sleep(5000);
//		System.out.println(driver.switchTo().alert().getText());
//		Thread.sleep(5000);
//		driver.switchTo().alert().sendKeys("Hi Veeresh how are you");
//		driver.switchTo().alert().accept();
//		Thread.sleep(5000);
//		System.out.println(driver.findElement(By.id("output")).getText());
//		Thread.sleep(5000);
//		driver.findElement(By.id("promptBox")).click();
//		Thread.sleep(5000);
//		System.out.println(driver.switchTo().alert().getText());
//		Thread.sleep(5000);
//		driver.switchTo().alert().sendKeys("Hello Muntha Veeresh are u going to pune");
//		Thread.sleep(5000);
//		driver.switchTo().alert().accept();
//		Thread.sleep(5000);
//		System.out.println(driver.findElement(By.id("output")).getText());
//		Thread.sleep(5000);
		
	}

}
