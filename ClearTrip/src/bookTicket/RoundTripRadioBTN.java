package bookTicket;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RoundTripRadioBTN {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Vivek Automation Study\\chromedriver_win32\\chromedriver_win32 (Chrome 78)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		
		//Verify the round trip is selected
		if (driver.findElement(By.xpath("//input[@id='RoundTrip']")).isSelected()==true)
		{
			System.out.println("Round Trip is enable");
		}
		else {
			System.out.println("Round Trip is not enable");
			driver.findElement(By.xpath("//input[@id='RoundTrip']")).click(); //if not selected click on round trip
		}
	
	}

}
