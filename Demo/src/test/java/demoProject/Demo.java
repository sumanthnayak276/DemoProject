package demoProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	public static void main(String[] args) {
		
		WebDriver d =new ChromeDriver();
		d.get("https://www.saucedemo.com/");
		d.close();
		
	}

}
