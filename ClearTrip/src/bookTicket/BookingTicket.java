package bookTicket;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BookingTicket {
		
		public static void main(String[] args)  {
			
			System.setProperty("webdriver.chrome.driver", "E:\\Vivek Automation Study\\chromedriver_win32\\chromedriver_win32 (Chrome 78)\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();

			driver.get("https://www.cleartrip.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS) ;
			
			//Enter from and too Location
			driver.findElement(By.id("FromTag")).sendKeys("Pune, IN - Lohegaon (PNQ)");
			driver.findElement(By.id("ToTag")).sendKeys("Bangalore, IN - Kempegowda International Airport (BLR)");
			
			driver.findElement(By.id("DepartDate")).click();
			//driver.findElement(By.xpath("/html/body	/div[2]/div[1]/table/tbody/tr[2]/td[7]/a")).click();
			driver.findElement(By.xpath("/html/body/div[2]/div[1]/table/tbody/tr[4]/td[3]/a")).click();
			
			//get current date
			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
		    Date date = new Date();  
		    System.out.println(formatter.format(date));
		    
		    //increase date by 5
		    Calendar c=Calendar.getInstance();
		    c.add(Calendar.DATE, 5);
		   // System.out.println(c);
		    
			//Search flight
			driver.findElement(By.xpath("//*[@id=\"SearchBtn\"]")).click();
			//driver.findElement(By.linkText("Search flights")).click();

			 WebDriverWait wait = new WebDriverWait(driver, 10);
		     wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//button[@type='submit'])[8]")));
		     driver.findElement(By.xpath("(//button[@type='submit'])[8]")).click();
		       
		     //click on continue booking
		     driver.findElement(By.xpath("//input[@id='itineraryBtn']")).click();
		     
		     //Email details
		     wait.until(ExpectedConditions.presenceOfElementLocated(By.id("username")));
		     driver.findElement(By.xpath("//input[@id='username']")).sendKeys("patilpranavap@gmail.com");
		     driver.findElement(By.xpath("//input[@id='username']")).clear();
		    //driver.findElement(By.xpath("//input[@id='username']")).sendKeys("patilpranavap@gmail.com");
		     
		     //Click on contue BTN'
		     try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		     driver.findElement(By.id("LoginContinueBtn_1")).click();
		     
		     //Details traveler
		     driver.findElement(By.id("AdultFname1")).sendKeys("Pranav");
		     driver.findElement(By.id("AdultLname1")).sendKeys("Patil");
		     
		     //Title Mr 3
		     driver.findElement(By.id("AdultTitle1")).click();
		     Select  day = new Select(driver.findElement(By.id("AdultTitle1")));
		     day.selectByVisibleText("Mr");
		     
		     //Date
		     driver.findElement(By.id("AdultDobDay1")).click();
		     Select  DOBdate = new Select(driver.findElement(By.id("AdultDobDay1")));
		     DOBdate.selectByVisibleText("4"); 
		     
		     //DOB date
		     driver.findElement(By.id("AdultDobMonth1")).click();
		     Select month= new Select(driver.findElement(By.id("AdultDobMonth1")));
		     month.selectByVisibleText("Jan");
		     
		     //year selection
		     driver.findElement(By.id("AdultDobYear1")).click();
		     Select year=new Select(driver.findElement(By.id("AdultDobYear1")));
		     year.selectByVisibleText("1994");
		     
		     //Nationality select
		     Select nationality= new Select(driver.findElement(By.xpath("//input[@placeholder='Nationality' and @data-name='nationality']")));
		     nationality.selectByVisibleText("India");
		     //driver.findElement(By.xpath("//input[@placeholder='Nationality' and @data-name='nationality']")).sendKeys("India");
		     
		     //MObile number
		     driver.findElement(By.xpath("//input[@id='mobileNumber'and @name='contact1']")).sendKeys("9096214537");
		     
		     //comtinue BTN
		     driver.findElement(By.id("travellerBtn")).click();
     
		    // driver.quit();
	
		   
		}	

	}