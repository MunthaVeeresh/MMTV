package packages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XPathShortcuts19 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--disable-notifications");
		RemoteWebDriver driver = new ChromeDriver(options);
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		driver.manage().window().maximize();
//		String shottcuts = driver.findElement(By.id("//h1[.='Register']")).getText();
//		System.out.println(shottcuts);
		//text()---->.
//		String shottcuts = driver.findElement(By.xpath("//a[contains(.,'account')]")).getText();
//		System.out.println(shottcuts);
//		String shottcuts = driver.findElement(By.xpath("//td[starts-with(.,'Giovanni')]")).getText();
//		System.out.println(shottcuts);
		String shottcuts = driver.findElement(By.xpath("//label[normalize-space(.='First Name ')]")).getText();
		System.out.println(shottcuts);
	}

}
