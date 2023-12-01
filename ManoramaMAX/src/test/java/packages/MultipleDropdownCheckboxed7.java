package packages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleDropdownCheckboxed7 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--disable-notifications");
		RemoteWebDriver driver = new ChromeDriver(options);
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		Thread.sleep(5000);
		driver.manage().window().maximize();//sinle  selecting dropdown list
//		WebElement course = driver.findElement(By.id("course"));//store the cource varable
//		Select cnd = new Select(course);
//		List<WebElement> cndOptions = cnd.getOptions();
//		for(WebElement option : cndOptions) {
//			System.out.println(option.getText());
//		}
//		cnd.selectByIndex(1);//java
//		Thread.sleep(5000);
//		cnd.selectByValue("net");//.net
//		Thread.sleep(5000);
//		cnd.selectByVisibleText("Javascript");//Javascript
//		String selectText = cnd.getFirstSelectedOption().getText();
//		System.out.println("Selected visible Text - + selectText");
		WebElement idselect = driver.findElement(By.id("ide"));//multiple selecting dropdown list
		Select iddl = new Select(idselect);
		List<WebElement> iddloption = iddl.getOptions();
		for(WebElement optind : iddloption) {
			System.out.println(optind.getText());
		}
		iddl.selectByIndex(0);
		Thread.sleep(5000);
		iddl.selectByValue("ij");
		Thread.sleep(5000);
		iddl.selectByVisibleText("NetBeans");
		Thread.sleep(5000);
		iddl.deselectByVisibleText("IntelliJ IDEA");
		List<WebElement> seleoptions = iddl.getAllSelectedOptions();
		for(WebElement seleoption : seleoptions) {
			System.out.println("selected visibleText -"+seleoption.getText());
		}
		
	}

}
