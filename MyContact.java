package WebDriverDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MyContact {

	public static void main(String[] args) {
		WebDriver driv= new ChromeDriver();
		driv.manage().window().maximize();
		driv.get("https://www.mycontactform.com/samples.php");
		driv.findElement(By.xpath("//*[@id=\"contactForm\"]/table/tbody/tr[9]/td/div[1]/input[5]")).click();
		driv.findElement(By.id("q7")).sendKeys("04-13-2023");
		
		WebElement we= driv.findElement(By.id("q8"));
		System.out.println(we.getText());
		Select s = new Select(we);
		s.selectByVisibleText("FL");
		

	}

}
