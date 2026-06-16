package seleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BasicsMethods {

	public static void main(String[] args) {
		
		WebDriver driver= new EdgeDriver();  //upcasting
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("name")).sendKeys("Priya");
		driver.findElement(By.id("email")).sendKeys("dharsinipriya1991@gmail.com");
		driver.findElement(By.id("phone")).sendKeys("7401410546");
		driver.findElement(By.id("textarea")).sendKeys("NO-205,Perungalathur,chennai-600063");
		System.out.println("New branch is added");
		System.out.println(driver.getCurrentUrl());
		
		
	}
	
	
	
	
}
