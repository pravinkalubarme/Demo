package pravin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InvokeChromeBrowser {
	public static void main(String[] args) {
		
		// chromedriver.exe is used for invoking browser
		// If we skip, System.setProperty("webdriver.chrome.driver","C:\\Users\\Pravin\\eclipse-workspace\\Introduction\\drivers\\chromedriver.exe");, selenium manager will take care of invoking browser
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pravin\\eclipse-workspace\\Introduction\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("/html/body/a")).click();
		driver.quit();
		System.out.println("Test completed");
	}
}
