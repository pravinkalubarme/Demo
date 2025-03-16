package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Hello World");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));

		/*
		 * Locators-- Id, Name, ClassName, TagName, XPath, LinkText, PartialLinkText, CSSSelector
		 */

		// Locator--id
		WebElement inputUsernameTextBox = driver.findElement(By.id("inputUsername"));
		// WebElement Method-- Send Keys
		inputUsernameTextBox.sendKeys("Pravin");
		// Locator--name
		WebElement passwordTextBox = driver.findElement(By.name("inputPassword"));
		// WebElement Method-- Send Keys
		passwordTextBox.sendKeys("Pravin");
		// Locator--ClassName
		// className=submit signInBtn--> If there is space, means there are 2 classes:
		// submit & signInBtn
		// WebElement submitBtn = driver.findElement(By.className("submit"));
		WebElement submitBtn = driver.findElement(By.className("signInBtn"));
		// WebElement Method-- Click()
		submitBtn.click();
		// Thread.sleep(3000);
		// Verify error message
		
		// Locator--CSS Selector
		
		// tagName.className // tagname is optional -- we can write .className  // eg. Button.signInBtn, p.error, .error
		// tagName#id        //tagname is optional -- we can write #id			// input#inputUsername. #inputUsername
		// tagName[attributeName='value']  // eg. input[placeholder='Username']
		// CSS Selector with index
		// tagName[attributeName='value']  // eg. input[placeholder='Username']:nth-child(2)
		
		WebElement errorMessage = driver.findElement(By.cssSelector("p.error"));
		// WebElement Method-- getText()
		String message = errorMessage.getText();
		System.out.println(message);
		
		// Locator--LinkText
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		// XPath
		//TagName
		//tagname[@attributeName='value']  // eg. //input[@placeholder='Username']
		//XPath with index
		//tagname[@attributeName='value']  // eg. //input[@type='text'][2]
		
//		String pageName = driver.findElement(By.xpath("//form/h2")).getText(); 
//		System.out.println(pageName);
		
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Pravin");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("Pk@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("pravinkalubarme@gmail.com");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//form/input[3]")).sendKeys("1234567890");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String password = driver.findElement(By.cssSelector("p.infoMsg")).getText();
		System.out.println(password);
	}
}
