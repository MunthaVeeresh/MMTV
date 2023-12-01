package packages;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Titlecurrenrurlpagesource15 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--disable-notifications");
		RemoteWebDriver driver = new ChromeDriver(options);
		driver.get("https://www.selenium.dev/downloads/");
		//currenturl
		String curenturl = driver.getCurrentUrl();
		System.out.println("Curent URL -"+ curenturl);
		//title
		String title = driver.getTitle();
		System.out.println("title -"+title);
		//pagesource
		String source = driver.getPageSource();
		System.out.println("pagecource -"+source);
		System.out.println("source");
		driver.quit();
		
	}

}
