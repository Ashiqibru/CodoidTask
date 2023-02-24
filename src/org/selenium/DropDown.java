package org.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\CodoidSeleniumTask\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://output.jsbin.com/osebed/2");
		driver.manage().window().maximize();
		
		WebElement fruits = driver.findElement(By.id("fruits"));
		
		Select s  = new Select(fruits);
		List<WebElement> options = s.getOptions();
		
		for (int i = 0; i < options.size(); i++) {
			s.selectByIndex(i);
		}
		
		List<WebElement> all = s.getAllSelectedOptions();
		for (int i = 0; i < all.size(); i++) {
			WebElement opts = all.get(i);
			String text = opts.getText();
			System.out.println(text);
			
			
		}
		
	}

}
