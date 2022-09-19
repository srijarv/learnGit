import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WikiSearch {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Dell/Downloads/chromedriver_win32/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.get("https://en.wikipedia.org/wiki/Main_Page");
		//driver.get("https://www.imdb.com/");
		driver.findElement(By.className("vector-search-box-input")).sendKeys("pushpa");
		Thread.sleep(3000L);
		List<WebElement> suggestions = driver.findElements(By.cssSelector("div[class='suggestions-results'] a"));
		for(WebElement suggestion : suggestions) {
			if(suggestion.getText().equalsIgnoreCase("Pushpa: The Rise")) {
				
				suggestion.click();
				break;
			}
		}
		
//		
		
		WebElement Element = driver.findElement(By.xpath("(//tr)[12]/child::td"));
		//div[contains(text(),'Release date')]/
		
		System.out.print(Element.getText());
		js.executeScript("arguments[0].scrollIntoView();", Element);
		
		Assert.assertEquals(Element.getText(), "17 December 2021");
		
		
	}

}
