package packages;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Explicitwait15 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--disable-notifications");
		RemoteWebDriver driver = new ChromeDriver(options);
		//WebDriver class
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//FluentWait class
		//FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(10));
		driver.get("https://testproject.io/");
		driver.manage().window().maximize();
		String parenthandle = driver.getWindowHandle();
		driver.findElement(By.linkText("Login")).click();
		Set<String> windownhandles = driver.getWindowHandles();
		for (String windownhandle : windownhandles) {
			if(!windownhandle.equals(parenthandle)) {
				driver.switchTo().window(windownhandle);
				//anonymous class in java
//				Function<WebDriver, Boolean> f = new Function<WebDriver, Boolean>() {
//					
//					@Override
//					public Boolean apply(WebDriver WebDriver) {
//						// TODO Auto-generated method stub
//						return WebDriver.findElement(By.id("username")).isDisplayed();
//					}
//				};
				//lambda expression
				//wait.until(f);
				wait.until(d->d.findElement(By.id("username")).isDisplayed());
				wait.until(ExpectedConditions.visibilityOfElementLocated((By.id("username"))));
				driver.findElement(By.id("username")).sendKeys("VeereshMuntha");
			}
			
		}
	}

}
