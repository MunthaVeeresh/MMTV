package packages;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindownHandelas10 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--disable-notifications");
		RemoteWebDriver driver = new ChromeDriver(options);
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)");
		Thread.sleep(5000);
//		String ParentHandles = driver.getWindowHandle();
//		System.out.println("Parent Windown Handel - "+ ParentHandles + driver.getTitle());
//		driver.findElement(By.id("newWindowBtn")).click();
//		Set<String> windownhandeles = driver.getWindowHandles();
//		for (String windownhandele : windownhandeles) {
//			if(!windownhandele.equals(ParentHandles)) {
//				driver.switchTo().window(windownhandele);
//				driver.manage().window().maximize();
//				Thread.sleep(5000);
//				driver.findElement(By.id("firstName")).sendKeys("Veeresh");
//				Thread.sleep(5000);
//				driver.close();
//			}
//			//System.out.println(windownhandele + driver.getTitle());
//		}
//		driver.switchTo().window(ParentHandles);
//		driver.findElement(By.id("name")).sendKeys("muntha");
//		driver.quit();
		String parenthandle = driver.getWindowHandle();
		System.out.println("Parent Handle -"+ parenthandle + driver.getTitle());
		driver.findElement(By.id("newWindowBtn")).click();
		Set<String> windowhandles = driver.getWindowHandles();
		for (String windowhandle : windowhandles) {
			driver.switchTo().window(parenthandle);
			driver.manage().window().maximize();
			Thread.sleep(5000);
			
		}
		System.out.println(parenthandle + driver.getTitle());
	}

}
