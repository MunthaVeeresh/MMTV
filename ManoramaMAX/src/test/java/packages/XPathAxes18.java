package packages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XPathAxes18 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--disable-notifications");
		RemoteWebDriver driver = new ChromeDriver(options);
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,550)", "");
		Thread.sleep(5000);
		//following-sibling
//		String axes = driver.findElement(By.xpath("//label[text()='Email']/following-sibling::input[@type='text']")).getTagName();
//		System.out.println(axes);
		//preceding-sibling
//		driver.findElement(By.xpath("//td[text()='Francisco Chang']/preceding-sibling::td/child::input")).click();
//		String preciding = driver.findElement(By.xpath("//td[text()='Francisco Chang']/preceding-sibling::td/child::input")).getTagName();
//		System.out.println(preciding);
		//parent
//		String parent = driver.findElement(By.xpath("//input[@type='password']/following::input")).getTagName();
//		System.out.println(parent);
		//following
		String parent = driver.findElement(By.xpath("//input[@type='password']/preceding::input[1]")).getTagName();
		System.out.println(parent);
		
		
	}
}
