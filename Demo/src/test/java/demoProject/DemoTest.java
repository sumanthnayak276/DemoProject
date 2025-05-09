package demoProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoTest {
	@Test
	public void demo() {
		
		WebDriver d =new ChromeDriver();
		d.get("https://www.saucedemo.com/");
		d.close();
		
	}

}
