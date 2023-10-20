import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.*;
public class microedge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());

	}

}
