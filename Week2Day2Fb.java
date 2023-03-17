package week2day2Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Week2Day2Fb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--remote-allow-origins=*");
		
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("https://en-gb.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		

		
		WebElement accountbtn = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		accountbtn.click();
		
		WebElement firstname = driver.findElement(By.name("firstname"));
		firstname.sendKeys("Bhuvana");
		
		
		WebElement lastname = driver.findElement(By.name("lastname"));
		lastname.sendKeys("Ganesan");
		
		
		WebElement Mobilenumbr = driver.findElement(By.name("reg_email__"));
		Mobilenumbr.sendKeys("9878909878");
		
		WebElement password = driver.findElement(By.id("password_step_input"));
		password.sendKeys("abc");
		
		
		Select date = new Select(driver.findElement(By.name("birthday_day")));
		date.selectByValue("7");
		
		Select month = new Select(driver.findElement(By.name("birthday_month")));
		month.selectByIndex(1);
		
		Select year = new Select(driver.findElement(By.name("birthday_year")));
		year.selectByVisibleText("1992");
		
		WebElement radiobtn = driver.findElement(By.xpath("//label[text()='Female']/following-sibling::input"));
		radiobtn.click();
		
		
		
		
		
		
		
	}

}
