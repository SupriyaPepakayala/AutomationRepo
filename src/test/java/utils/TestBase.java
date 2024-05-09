package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class TestBase {
public WebDriver driver;
	
	public WebDriver Intialization() throws IOException {
	Properties prop=new Properties();
	FileInputStream fs=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\globalproperty.properties");
	prop.load(fs);
	String url=prop.getProperty("QAurl");
	
	String browser=prop.getProperty("browser");
	String browser_mvn=System.getProperty("browser");
	 
	String browserName=browser_mvn!=null ? browser_mvn : browser;
	
	if(driver==null)
	{
	if(browserName.equalsIgnoreCase("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajeev\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	
	if(browserName.equalsIgnoreCase("firefox"))
    {
    	
  	System.setProperty("webdriver.firefox.driver", "C:\\Users\\Rajeev\\Geckodriver\\geckodriver.exe");
  	driver=new FirefoxDriver();
    }
	
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get(url);
	}
	return driver;
	}	
	
}
