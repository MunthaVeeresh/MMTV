package packages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GithubLoginPage4 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--disable-notifications");
		RemoteWebDriver driver = new ChromeDriver(options);
		driver.get("https://github.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//a[@data-hydro-click-hmac='cd4f672ed9a2fa51ea92c28de162e81edb2d11a2aad6884ec89a6d60b21b1cfb'])[1]")).click();
		Thread.sleep(5000);
		highlight(driver,driver.findElement(By.id("login_field")));
		Thread.sleep(5000);
		highlight(driver,driver.findElement(By.name("password")));
		Thread.sleep(5000);
		highlight(driver,driver.findElement(By.className("header-logo")));
		Thread.sleep(5000);
		highlight(driver,driver.findElement(By.linkText("Forgot password?")));
		Thread.sleep(5000);
		highlight(driver,driver.findElement(By.partialLinkText("Create an ")));
		Thread.sleep(5000);
		highlight(driver,driver.findElement(By.tagName("Sign in to GitHub")));
		Thread.sleep(5000);
		highlight(driver,driver.findElement(By.xpath("//label[contains(text(),'Username or email address')]")));
		Thread.sleep(5000);
		highlight(driver,driver.findElement(By.cssSelector("//input[@name='commit']")));
		Thread.sleep(5000);
	}
	public static void highlight(WebDriver driver,WebElement element) {
//		JavascriptExecutor jsExecutor = (JavascriptExecutor)driver;
//		jsExecutor.executeScript("arguments[0].setAttribute('style','border:2px solid red;background:yellow')");
	}

}
