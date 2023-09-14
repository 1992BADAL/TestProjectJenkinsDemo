package mavenDemo.TestProject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class OpenBrowser {
	
	public WebDriver driver;
	
	@Test
	public void open() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		co.addArguments("use-fake-ui-for-media-stream");
		driver = new ChromeDriver(co);
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		

		driver.get("https://www.google.com/");
		System.out.println("page Title1 :"+ driver.getTitle());
		
		Thread.sleep(4000);
		
		driver.quit();
	}
	
	
	
		
}
