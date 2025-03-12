package pravin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class InvokeEdgeBrowser {

	public static void main(String[] args) {
		// edgedriver.exe is used for invoking browser
		// If we skip, System.setProperty("webdriver.edge.driver","C:\\Users\\Pravin\\eclipse-workspace\\Introduction\\drivers\\edgedriver.exe");, selenium manager will take care of invoking browser
		
		// System.setProperty("webdriver.edge.driver", "C:\\Users\\Pravin\\eclipse-workspace\\Introduction\\drivers\\edgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("/html/body/a")).click();
		driver.quit();
		System.out.println("Test completed");
	}
}
