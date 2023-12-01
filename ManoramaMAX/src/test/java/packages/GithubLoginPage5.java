package packages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GithubLoginPage5 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--disable-notifications");
		RemoteWebDriver driver = new ChromeDriver(options);
		driver.get("https://github.com/login");
		driver.manage().window().maximize();
//		WebElement userTextName = driver.findElement(By.id("login_field"));
//		if(userTextName.isDisplayed()) {
//			if(userTextName.isEnabled()) {
//				userTextName.sendKeys("Veeresh");
//				String enterTectName= userTextName.getAttribute("value");
//				System.out.println("enterTectName");
//				Thread.sleep(5000);
//				userTextName.clear();			
//				}
//			else
//				System.out.println("username not enable");
//		}
//		else
//			System.out.println("username not disable");
//		WebElement hyd = driver.findElement(By.id("password"));
//		if(hyd.isDisplayed()) {
//			if(hyd.isEnabled()) {
//				hyd.sendKeys("jfhuefyueuyuewyufwyfyfywetyfweyrt");
//				String enterpassword = hyd.getAttribute("value");
//				System.out.println("enterpassword");
//				Thread.sleep(5000);
//				hyd.clear();
//			}
//			else
//				System.out.println("Enter name disable");
//		}
//		else
//		{
//			System.out.println("Enter name enable");
//		}
//		driver.close();
		WebElement element = driver.findElement(By.name("login"));
		if(element.isDisplayed()) {
			if(element.isEnabled()) {
				element.sendKeys("i am ging to hyderabed for some healty issue");
				String weelmt = element.getAttribute("value");
				System.out.println("hello veeresh");
				Thread.sleep(5000);
				element.clear();
			}
			else
				System.out.println("Pass");
		}
		else 
			System.out.println("Fail");
		
	}

}
