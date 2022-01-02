package GitTestForGenkins;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchingBrowser {
	
	@Test
	public void launchbrowser() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandeep\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		driver.get("https://staging.tutist.com/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	
		
		driver.findElement(By.id("email")).sendKeys("sandeepkumar@mailinator.com");
		driver.findElement(By.id("password")).sendKeys("123");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		
		WebElement emall=driver.findElement(By.xpath("//div[@id='toast-container']/div/div[2]"));
		
		String strr=emall.getText();
		
		System.out.println(strr);
	
}
	

}
