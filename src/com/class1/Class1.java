package com.class1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Class1 {

	public static void main(String[] args) throws InterruptedException{
	
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	 
		
		driver.get("https://www.monster.com/");
		Thread.sleep(3000);
		driver.findElement(By.id("q2")).sendKeys("selenium");
		
		//driver.findElement(By.id("email")).sendKeys("eaglewing126@gmail.com");
	
		
		//driver.findElement(By.name("login")).click();
		//driver.quit();
}
}
