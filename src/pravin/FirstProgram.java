package pravin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstProgram {
	public static void main(String[] args) {
		
		// chromedriver.exe is used for invoking browser
		// If we skip, System.setProperty("webdriver.chrome.drivwe","C:\\Users\\Pravin\\Documents\\chromedriver"), selenium manager will take care of invoking browser
		
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pravin\\Documents\\chromedriver");
//		WebDriver driver = new ChromeDriver();

//		System.setProperty("webdriver.gecko.driver","C:\\Users\\Pravin\\Documents\\geckodriver");
//		WebDriver driver = new FirefoxDriver();
		
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
//		driver.get("https://rahulshettyacademy.com/");
//		//driver.get("https://googlechromelabs.github.io/chrome-for-testing/");
//		String pageTitle = driver.getTitle();
//		System.out.println(driver.getTitle());
//		System.out.println(driver.getCurrentUrl());
//		driver.close();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("/html/body/a")).click();
		driver.quit();
		System.out.println("Test completed");
	}
}
