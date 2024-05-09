package StepDefinition;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import utils.testContextSetup;

public class Hooks {

	testContextSetup testcontextsetup;
	public Hooks(testContextSetup testcontextsetup) {
		this.testcontextsetup=testcontextsetup;
	}
	
@After
public void close() throws IOException {
	testcontextsetup.testBase.Intialization().quit();
}
	
@AfterStep
public void addScreenshot(Scenario scenario) throws IOException {
	
	WebDriver driver=testcontextsetup.testBase.Intialization();
	if(scenario.isFailed())
	{
		File source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		byte[] filecontent=FileUtils.readFileToByteArray(source);
		scenario.attach(filecontent, "image/png", "image");
	}
	
}
	
	
	
	
	
	
}
