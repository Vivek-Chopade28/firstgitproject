package bookTicket;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DDLFrom {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Vivek Automation Study\\chromedriver_win32\\chromedriver_win32 (Chrome 78)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		
		//From DDl list click
		driver.findElement(By.xpath("//select[@id='Adults']")).click();;
		
		Thread.sleep(3000);
		
		WebElement element = driver.findElement(By.xpath("//select[@id='Adults']"));
		Select select = new Select(element);
		List <WebElement> list = select.getOptions();
		for (int i=0; i<=list.size();i++)
		{
			System.out.println(list.get(i).getText());
		}	
		driver.quit();
	}

}
