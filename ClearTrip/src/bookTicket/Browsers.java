package bookTicket;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browsers {
	
	public void ChromeBrowser(){
		System.setProperty("webdriver.chrome.driver", "E:\\Vivek Automation Study\\chromedriver_win32\\chromedriver_win32 (Chrome 78)\\chromedriver.exe");
		WebDriver cdriver=new ChromeDriver();
		
	}
	
	public void MozillaBrowser() {
		System.setProperty("webdriver.Firefox.driver", "E:\\Vivek Automation Study\\Mozilla Driver\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver mdriver=new FirefoxDriver();
	}
	
	public void IEBrowser() {
		System.setProperty("webdriver.IE.driver", "E:\\Vivek Automation Study\\IE Driver\\IEDriverServer_x64_3.150.1\\IEDriverServer.exe");
		WebDriver iedriver=new InternetExplorerDriver();
		
	}

}
