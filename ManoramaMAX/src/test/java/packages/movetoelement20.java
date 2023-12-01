package packages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class movetoelement20 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--disable-notifications");
		RemoteWebDriver driver = new ChromeDriver(options);
		//driver.get("https://www.orangehrm.com/");
		driver.manage().window().maximize();
		//movetoelement or mousehover,click,double click,right click or content click
//	    driver.findElement(By.name("username")).sendKeys("Admin");
//	    driver.findElement(By.name("password")).sendKeys("admin123");
//	    driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		//Actions actions = new Actions(driver);
//		actions.moveToElement(driver.findElement(By.xpath("//a[text()='Resources']")));
//		actions.moveToElement(driver.findElement(By.xpath("//a[text()='eBooks']"))).click();
//		actions.perform();
//		actions.moveToElement(driver.findElement(By.xpath("//a[text()='Company']")));
//		actions.moveToElement(driver.findElement(By.xpath("//a[text()='Executive Profiles']"))).click();
//		actions.perform();
//		Thread.sleep(5000);
//		Actions actions = new Actions(driver);
//		actions.doubleClick(driver.findElement(By.id("Form_getForm_FullName"))).perform();
//		//double click
//		driver.findElement(By.xpath("(//button[text()='Contact Sales'])[2]")).click();
//		driver.findElement(By.name("FullName")).sendKeys("munthaveereshhrjjsjdhhdhjasdwhiduhweufiuewhfuiwhiuwrhui");
//		actions.doubleClick(driver.findElement(By.name("FullName"))).perform();
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		Actions actions = new Actions(driver);
		actions.contextClick(driver.findElement(By.xpath("//span[text()='right click me']"))).perform();
		driver.findElement(By.xpath("//span[text()='Delete']")).click();
		Thread.sleep(5000);
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		Thread.sleep(5000);
		alert.accept();
		
	}

}
