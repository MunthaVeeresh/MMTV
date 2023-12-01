package packages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElement16 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--disable-notifications");
		RemoteWebDriver driver = new ChromeDriver(options);
		driver.get("https://github.com/login");
		driver.manage().window().maximize();
		//TagName
		//System.out.println(driver.findElement(By.name("commit")).getTagName());
		//System.out.println(driver.findElement(By.name("commit")).getAttribute("name"));
//		String attribute = driver.findElement(By.name("commit")).getAttribute("type");
//		System.out.println("attribute value -"+attribute);
//		String attrubete = driver.findElement(By.name("commit")).getAttribute("value");
//		System.out.println("attribute value -"+ attrubete);
//		WebElement usernametext = driver.findElement(By.id("login_field"));
//		usernametext.sendKeys("munthaveeresh2000@gmail.com");
//		System.out.println(usernametext.getAttribute("value"));
		//String text = driver.findElement(By.xpath("//input[@id='login_field']/preceding-sibling::label")).getText();
//		String text = driver.findElement(By.xpath("//label[@for='login_field']")).getText();
//		System.out.println(text);
//		String cssvalue = driver.findElement(By.name("commit")).getCssValue("background-color");
//		System.out.println(cssvalue);
//		driver.quit();
//		String text = driver.findElement(By.xpath("//a[text()='Forgot password?']")).getText();
//		System.out.println(text);
//		String text =driver.findElement(By.xpath("//label[@for='password']")).getTagName();
//		System.out.println(text);
		//in html spaces in between texes
//		String text = driver.findElement(By.xpath("//p[contains(text(),'New to GitHub?')]")).getText();
//		System.out.println(text);
//		String text = driver.findElement(By.xpath("//input[@value='Sign in']")).getText();
//		System.out.println(text);
//		WebElement element = driver.findElement(By.id("login_field"));
//		element.sendKeys("Munthaveeresh2000@gmail.com");
//		System.out.println(element.getAttribute("value"));
//		WebElement element = driver.findElement(By.id("password"));
//		element.sendKeys("7032934611");
//		System.out.println(element.getAttribute("value"));
//		String text = driver.findElement(By.xpath("//a[text()='Forgot password?']")).getText();
//		System.out.println(text);
//		String text = driver.findElement(By.xpath("//label[contains(text(),'Password')]")).getText();
//		System.out.println(text);
//		String text = driver.findElement(By.xpath("//input[@data-signin-label='Sign in']")).getTagName();
//		System.out.println(text);
		String text = driver.findElement(By.xpath("//h1[text()='Sign in to GitHub']")).getText();
		System.out.println(text);
		driver.quit();
	}

}
