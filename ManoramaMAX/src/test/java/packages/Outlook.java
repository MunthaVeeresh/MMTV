package packages;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;


public class Outlook {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://outlook.office.com/mail/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.name("loginfmt")).sendKeys("veereshm@yupptv.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@value='Next']")).click();
		driver.findElement(By.name("passwd")).sendKeys("ZZkzn271");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@value='Sign in']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@value='No']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@aria-label='New mail']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[@role='textbox'])[1]")).sendKeys("dexterm@yuuptv.com");
		driver.findElement(By.xpath("(//div[@role='textbox'])[2]")).sendKeys("veereshm@yupptv.com");
		driver.findElement(By.xpath("//div[@aria-label='Message body, press Alt+F10 to exit']")).sendKeys("hlo/sir/good evening/how are you??/");
		driver.findElement(By.xpath("//button[@aria-label='Attach file']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Browse this computer']")).sendKeys("C:\\Users\\Muntha Veeresh\\Downloads\\Skype_Picture_2023_02_09T07_40_17_702Z.jpeg");
	}

}
