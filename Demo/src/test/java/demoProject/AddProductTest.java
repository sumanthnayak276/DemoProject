package demoProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AddProductTest {
	@Test
	public void Addproduct() throws InterruptedException {
 WebDriver driver =new ChromeDriver();
 driver.get("https://www.saucedemo.com/");
 driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("standard_user");
 driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("secret_sauce");
 driver.findElement(By.xpath("//input[@name='login-button']")).click();
 driver.findElement(By.xpath("//button[@name='add-to-cart-sauce-labs-backpack']")).click();
 
 Thread.sleep(5000);
 
 driver.findElement(By.xpath("//button[@name='remove-sauce-labs-backpack']")).click();
 
 Thread.sleep(5000);
 
 driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
 
 Thread.sleep(5000);
 
 driver.findElement(By.xpath("//a[@data-test='logout-sidebar-link']")).click();
 
}
}
