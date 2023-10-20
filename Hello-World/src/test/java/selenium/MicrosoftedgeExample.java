package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MicrosoftedgeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\Hello-World\\src\\test\\resources\\driver\\msedgedriver.exe");
		WebDriver obj = new EdgeDriver();
		obj.get("https://amazon.com");
	}

}
