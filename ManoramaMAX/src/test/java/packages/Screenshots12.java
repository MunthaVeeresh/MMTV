package packages;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.bouncycastle.util.encoders.Base64;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshots12 {
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--disable-notifications");
		RemoteWebDriver driver = new ChromeDriver(options);
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
//		File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//	    FileUtils.copyFile(f, new File("./Screenshots/img.jpg"));
		//file
//		File sourcefile = driver.getScreenshotAs(OutputType.FILE);
//		File desfile = new File("./Screenshots/img.jpg");
//		FileUtils.copyFile(sourcefile, desfile);
//		System.out.println("Screenshots saved successufuly");
//		driver.quit();
		//Bytes
//		byte[] bts = driver.getScreenshotAs(OutputType.BYTES);
//		File desfile = new File("./Screenshots/img.jpg");
//		FileOutputStream fos = new FileOutputStream(desfile);
//		fos.write(bts);
//		fos.close();
//		System.out.println("Screenshots saved successufuly");
//		driver.quit();
		//Base64
		String  bts = driver.getScreenshotAs(OutputType.BASE64);
		byte[] btsarry = Base64.decode(bts);
		File desfile = new File("./Screenshots/img.jpg");
		FileOutputStream fos = new FileOutputStream(desfile);
		fos.write(btsarry);
		fos.close();
		System.out.println("Screenshots saved successufuly");
		driver.quit();
	}

}
