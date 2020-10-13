package com.pom.utilities;

import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Driver_setup {
	
	
	static WebDriver driver;
    public WebDriver getChromeDriver() throws IOException {
    	
    	String ChromePath = ".\\Driver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", ChromePath );
	
		driver = new ChromeDriver();
		return driver;
    	
    }
    
    public WebDriver getEdgeDriver() throws IOException
    {
    	 String ExplorerPath = ".\\Driver\\msedgedriver.exe";
			System.setProperty("webdriver.edge.driver", ExplorerPath );
			

			 driver = new EdgeDriver();	
		return driver;
    	
    }


}
