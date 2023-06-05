package tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	public static WebDriver driver;
	
	@BeforeSuite
	public void init() throws IOException, InterruptedException {
		
		//step-1 
		WebDriverManager.chromedriver().setup();
		
		//step-2
		driver = new ChromeDriver();
		
		//step-3 maximize window
		driver.manage().window().maximize();
	
		//step-4 open webpage
		driver.get(readProperty("URL"));
		
		//step-5 implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		System.out.println("browser launch successfully");
	}
	
	public static String readProperty(String v) throws IOException, InterruptedException {
		
		String path ="C:\\Users\\Admin\\eclipse-workspace\\Katraj-25-June-B-Maven\\src\\test\\resources\\config.properties";
		Properties prop =new Properties();
		
		FileInputStream fis =new FileInputStream(path);
		
		prop.load(fis);
		Thread.sleep(2000);
		
		String val = prop.getProperty(v);
		
		return val;
	}
	
	@AfterSuite
	public void tearDown() {
		
		driver.close();
	}

}
