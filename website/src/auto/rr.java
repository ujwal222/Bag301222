package auto;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class rr 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver2.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Browser is open");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.booking.com/");
		System.out.println("URL is opened");
		
		driver.findElement(By.xpath("//*[@id=\"frm\"]/div[1]/div[2]/div[1]/div[2]/div/div/div/div/span")).click();
		
		String MY="April 2023";
		String day="17";
		
		while(true)
		{
			String q1 = driver.findElement(By.xpath("//*[@id=\"bui-calendar-1668107825598dkffuj\"]")).getText();
			
			if(q1.equals(MY))
			{
				break;
			}
			else
			{
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/form/div[1]/div[2]/div[2]/div/div/div[2]")).click();
			}
		}
		
		
		//day
		List<WebElement> q11 = driver.findElements(By.xpath("//table//tbody//tr//td"));
		
		for(WebElement w1 : q11)
		{
			if(w1.equals(day))
			{
				w1.click();
				break;
			}
		}
		
		
			
	}
}




