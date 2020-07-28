package SeleniumPractice.SeleniumPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Workingwithelements {

	private WebDriver driver;


	@BeforeMethod
	public void fn_setup_browser() throws Exception
	{
		try
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		}
		catch(Exception e)
		{
			throw e;
		}
	}
	@Test
	public void fn_select_Seselct_checkcox() throws Exception
	{
		try
		{
			driver.get("https://demoqa.com/checkbox");
			driver.findElement(By.xpath("//span[@class='rct-text']//button[@class='rct-collapse rct-collapse-btn']")).click();
			boolean ture=driver.findElement(By.xpath("//span[@class='rct-text']//input")).isSelected();
			Thread.sleep(2000);
			List<WebElement> checkBoxList =driver.findElements(By.xpath("//span[@class='rct-checkbox']"));
			for(WebElement checkBox:checkBoxList)
			{
				Thread.sleep(2000);
				checkBox.click();   
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}
}
