package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hellofirefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\Hello-World\\src\\test\\resources\\driver\\geckodriver.exe");
				WebDriver obj = new FirefoxDriver();
				obj.get("https://amazon.com");

	}

}