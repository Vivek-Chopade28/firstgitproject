package bookTicket;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HotelTab {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Vivek Automation Study\\chromedriver_win32\\chromedriver_win32 (Chrome 78)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();

		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		
		if (driver.findElement(By.xpath("//a[@title='Find hotels in destinations around the world']")).isSelected()) {
			System.out.println("Flight tab is selected");
		}
		else
		{
			driver.findElement(By.xpath("//a[@title='Find hotels in destinations around the world']")).click();
		}	

	}

}
