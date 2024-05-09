package utils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class genericUtils {

	public WebDriver driver;
	
public genericUtils(WebDriver driver) {
	this.driver=driver;
}

public void SwitchToWindow() {
	Set<String> windows= driver.getWindowHandles();
    Iterator<String> it= windows.iterator();
     String parentwindow=it.next();
     String childwindow=it.next();
    driver.switchTo().window(childwindow);	
}
	
}
