import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class Introselenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions Option = new ChromeOptions();
		Option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(Option); 
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	}

}
