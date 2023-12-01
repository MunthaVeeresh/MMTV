package packages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegistationForm3 {
	private static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--disable-notifications");
		RemoteWebDriver driver = new ChromeDriver(options);
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		driver.manage().window().maximize();
		//WebElement element = webdriver.findElement(AutomaticDataLockTimed);

		//if (!element.getAttribute("value").equals("true"))
		{
		    //JSUtil.clickElementUsingBySelector(AutomaticDataLockTimed, driver);
		}
//		driver.findElement(By.xpath("(//input[@name='name'])[2]")).sendKeys("Muntha");
//		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("munthaveeresh2000@gmail.com");
//		driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("MVeeresh@123");
//		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("MVeeresh@123");
//		Thread.sleep(5000);
		//driver.findElement(By.xpath("//button[text()='Register']")).click();
	}
	private static void driver(WebElement element1) {
		// TODO Auto-generated method stub
		
	}
	public static void higilater(WebElement element) {
		//driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
//		JavascriptExecutor jse = (JavascriptExecutor)driver;
//		jse.executeScript("argumenrs[0]");	
	}
	public void subtitle() {
		//driver.findElement(By.xpath("https://www.youtube.com/watch?v=ilTFwMV3lHk&list=RDCMUC1Bbtdbpfert8leeKx2mssw&start_radio=1&rv=ilTFwMV3lHk&t=1876"));
		
	}

}
