package packages;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.dispatcher.JavaDispatcher.Instance;

public class PageLoadTime13 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--disable-notifications");
		RemoteWebDriver driver = new ChromeDriver(options);
		Thread.sleep(5000);
		//in wc3wedriver default time is 300sec
		//driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.SECONDS);
		Instant startime = Instant.now();
		System.out.println(startime.toString());
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		Instant endtime= Instant.now();
		System.out.println(endtime.toString());
		Duration duration = Duration.between(startime, endtime);
		System.out.println("PageTimeLoadTime: "+duration.toMillis() + "milisces");
		System.out.println(driver.getTitle());
		driver.close();
		
	}

}
