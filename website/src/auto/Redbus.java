package auto;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver2.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Browser is open");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.redbus.com/");
		System.out.println("URL is opened");
		
		driver.findElement(By.xpath("//button[text()='Accept All']")).click();
		
		//source
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Mumbai");
		List<WebElement>sourceList=driver.findElements(By.xpath("//div[@class='autoFill autosuggest-ul rdc-src']//li"));
		
		String expected="Thane West, Mumbai, Maharashtra, India";
	
	
		for(WebElement q1:sourceList)
		{
			String q2 = q1.getText();
			if(q2.equalsIgnoreCase(expected))
			{
				q1.click();
				break;
			}
		}
		
		System.out.println("Source is selected");
	
		//dextination
		 WebElement e1 = driver.findElement(By.xpath("//div[@class='destination input-box']"));
		 e1.click();
		 Thread.sleep(2000);
		e1.sendKeys("Aurang");
		Thread.sleep(1000);
		List<WebElement> dest = driver.findElements(By.xpath("//div[@class='autoFill autosuggest-ul rdc-dest']//li"));
		String expected1="Shahnoor Miya Dargah Chowk, Aurangabad, Maharashtra, India";
		
		for(WebElement w1:dest)
		{
			String w2 = w1.getText();
			if(w2.equalsIgnoreCase(expected1))
			{
				w1.click();
				break;
			}
		}
		System.out.println("destination is selected");
		
		
		
		
		
		
		
		
	Thread.sleep(2000);
	driver.quit();
		
		
		
	}
}
