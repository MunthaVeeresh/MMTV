package packages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XPathIndex17 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--disable-notifications");
		RemoteWebDriver driver = new ChromeDriver(options);
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,950)", "");
		Thread.sleep(5000);
		//driver.findElement(By.id("//table[@id='contactList']/tbody/tr[2]")).click();
		//driver.findElement(By.xpath("//table[@id='contactList']/tbody/tr[2]")).click();
		//driver.findElement(By.xpath("//input[@type='checkbox'][1]")).click();
		//driver.findElement(By.xpath("(//input[@type='checkbox'])[4]")).click();
//		String background = driver.findElement(By.xpath("//input[@type='checkbox'])[4]\"")).getCssValue("background-color");
//		String sign = driver.findElement(By.xpath("//a[text()='Sign in']")).getText();
//		String account = driver.findElement(By.xpath("//a[contains(text(),' account')]")).getText();
		String contains = driver.findElement(By.xpath("//div[contains(@class,'signin')]")).getText();
		String startswith = driver.findElement(By.xpath("//a[starts-with(text(),'Sign in into ')]")).getText();
		String normalizespace = driver.findElement(By.xpath("//label[normalize-space(text()='First Name')]")).getText();
		String last = driver.findElement(By.xpath("(//table[@id='contactList']/tbody/tr)[last()]")).getText();
		String position = driver.findElement(By.xpath("(//table[@id='contactList']/tbody/tr)[position()=5]")).getText();
		System.out.println(position);
	}

}
