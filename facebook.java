package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
       WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
	
		driver.get("https://en-gb.facebook.com/");
			
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));


driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
driver.findElement(By.name("firstname")).sendKeys("Daneswari");
driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("kalapu");
driver.findElement(By.name("reg_email__")).sendKeys("9874563217");
driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("kalapu");

WebElement findElement = driver.findElement(By.id("day"));
Select dd = new Select(findElement);
dd.selectByValue("16");

WebElement findElement2 = driver.findElement(By.id("month"));
Select dd2 = new Select(findElement2);
dd2.selectByVisibleText("May");

WebElement findElement3 = driver.findElement(By.id("year"));
Select dd3 = new Select(findElement3);
dd3.selectByValue("1992");

driver.findElement(By.xpath("//label[text() = 'Female']")).click();

	}

}




//Step 11: Handle all the three drop downs
//Step 12: Select the radio button "Female" 