package pravin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InvokeFirefoxBrowser {

	public static void main(String[] args) {
		// geckodriver.exe is used for invoking browser
		// If we skip, System.setProperty("webdriver.gecko.driver","C:\\Users\\Pravin\\eclipse-workspace\\Introduction\\drivers\\geckodriver.exe");, selenium manager will take care of invoking browser
		
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\Pravin\\eclipse-workspace\\Introduction\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("/html/body/a")).click();
		driver.quit();
		System.out.println("Test completed");
	}
}