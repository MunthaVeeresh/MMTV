package packages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class javascripetExecutor {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		//WebDriver driver = ChromeDriver();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*\"");
		options.addArguments("--disable-notifications");
		RemoteWebDriver driver = new ChromeDriver(options);
		JavascriptExecutor javaex = JavascriptExecutor(driver);
	}

	private static JavascriptExecutor JavascriptExecutor(RemoteWebDriver driver) {
		// TODO Auto-generated method stub
		return null;
	}

}
