package week2day2Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Week2Day2Acme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("https://acme-test.uipath.com/login");
		
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("kumar.testleaf@gmail.com");

		
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("leaf@12");
		
		WebElement  loginbtn = driver.findElement(By.xpath("//button[@type='submit']"));
		loginbtn.click();
	
		System.out.println(driver.getTitle());
		
		WebElement  logout = driver.findElement(By.linkText("Log Out"));
		logout.click();
		
		driver.close();
		
	}

}
