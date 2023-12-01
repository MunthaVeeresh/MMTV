package packages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {

	private static ChromeDriverService options;

	public static void main(String[] args) throws Exception{
		//download latest chrome driver softwrae
				WebDriverManager.chromedriver().setup();
				ChromeOptions options=new ChromeOptions();
				options.addArguments("--remote-allow-origins=*");
				options.addArguments("--disable-notifications");
				//Open chrome browser usning that chrome driver software
//				System.setProperty("chromeoptions.args", "--remote-allow-origins=*");
				RemoteWebDriver driver = new ChromeDriver(options);
				//launch site
				driver.get("https://www.manoramamax.com/");
				Thread.sleep(5000);
				//driver.switchTo().alert().accept();
				//driver.executeScript("history.go(0);");
				driver.manage().window().maximize();
				//do login
				Thread.sleep(5000);
				driver.findElement(By.xpath("//img[@alt='profile']")).click();
				JavascriptExecutor jse = (JavascriptExecutor)driver;
				jse.executeScript("window.scrollBy(0,250)");
				Thread.sleep(5000);
				driver.findElement(By.id("emailOrMobile")).sendKeys("8328089512");
				driver.findElement(By.id("Password")).sendKeys("123456");
				Thread.sleep(5000);
				driver.findElement(By.xpath("//button[text()='Sign in']")).click();
//				driver.findElement(By.xpath("//input[@placeholder='Enter Email/Mobile Number']")).sendKeys("8328089512");
//				driver.findElement(By.name("password")).sendKeys("123456");
//				Thread.sleep(5000);
//				//driver.findElement(By.xpath("//button[text()='Sign in']")).click();
//				driver.findElement(By.xpath("//button[@type='submit']")).click();
//				WebElement ele = driver.findElement(By.xpath("//button[text()='Sign in']"));
//				JavascriptExecutor executor = (JavascriptExecutor)driver;
//				executor.executeScript("arguments[0].click();", ele);
//				Thread.sleep(5000);
//				JavascriptExecutor jse1 = (JavascriptExecutor)driver;
//				jse1.executeScript("window.scrollBy(0,250)");
//				Thread.sleep(5000);
//				jse1.executeScript("window.scrollBy(0,-250)");
//				jse1.executeScript("scroll(0, -250);");
//				driver.findElement(By.xpath("//img[@alt='Shefeekkinte Santhosham']")).click();
//				Thread.sleep(5000);
//				//driver.findElement(By.xpath("//p[text()='Like']")).click();
//				//driver.findElement(By.xpath("//img[@alt='Meow']")).click();
//				driver.findElement(By.xpath("//li[text()='Music']")).click();
//				//JavascriptExecutor jse = (JavascriptExecutor)driver;
//				//jse.executeScript("window.scrollBy(0,250)");
//				Thread.sleep(5000);
//				JavascriptExecutor jse11 = (JavascriptExecutor)driver;
//				jse11.executeScript("window.scrollBy(0,100)");
//				driver.findElement(By.className("verticalimage _img_152845_ShuffleSongsportal undefined"));
//				driver.findElement(By.xpath("//img[@alt='Oruthee | Run Baby Run | Video Song']")).click();
//				driver.findElement(By.xpath("(//p[text()='See More'])[7]")).click();
//				Thread.sleep(5000);
//				driver.findElement(By.xpath("(//img[@data-processed='true'])[1]"));
				//Thread.sleep(5000);
		}

}