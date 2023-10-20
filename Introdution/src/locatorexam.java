import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class locatorexam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions Option = new ChromeOptions();
		Option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(Option); 
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
    driver.findElement(By.id("inputUsername")).sendKeys("Rupali");
driver.findElement(By.name("inputPassword")).sendKeys("Helloselenium");
driver.findElement(By.className("signInBtn")).click();
	}

}
