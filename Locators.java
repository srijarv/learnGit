import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:/Users/Dell/Downloads/chromedriver_win32/chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		
		// System.setProperty("webdriver.edge.driver", "/Users/rahulshetty/Documents/msedgedriver");
		
		// WebDriver driver = new EdgeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		driver.findElement(By.id("inputUsername")).sendKeys("Srija");
		
		driver.findElement(By.name("inputPassword")).sendKeys("hello123");
		
		driver.findElement(By.className("signInBtn")).click();
		
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Anubhav");
		
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("anubhavgupta@gmail.com");
		
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("anubhavgupta36@gmail.com");
		
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9660123456");
		
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Srija");
		
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		
		driver.findElement(By.id("chkboxOne")).click();
		
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
	}
}
