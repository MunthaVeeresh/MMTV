package packages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicControls6 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--disable-notifications");
		RemoteWebDriver driver = new ChromeDriver(options);
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		driver.findElement(By.id("firstName")).sendKeys("Veeresh");
		driver.findElement(By.id("lastName")).sendKeys("Muntha");
		driver.findElement(By.id("femalerb")).click();
		driver.findElement(By.id("englishchbx")).click();
		driver.findElement(By.id("hindichbx")).click();
		WebElement french = driver.findElement(By.id("frenchchbx"));
		french.click();
		Thread.sleep(5000);
		if(french.isSelected())
			french.click();
		Thread.sleep(5000);
		driver.findElement(By.id("email")).sendKeys("munthaveeresh2000@gmail.com");
		driver.findElement(By.id("password")).sendKeys("MVeeresh@123");
		driver.findElement(By.id("registerbtn")).click();
		System.out.print(driver.findElement(By.id("msg")).getText());
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Click here to navigate to the home page']")).click();
		}

}
