package org.rb;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robotaction {
	
	public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Antony\\Robot\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		
		
		driver.manage().window().maximize();
		
		for (int i = 1; i <= 3; i++) {
			
			Robot robot = new Robot();
			
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
		
		robot.keyPress(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_A);
		

        robot.keyPress(KeyEvent.VK_N);
       robot.keyRelease(KeyEvent.VK_N);
       
       robot.keyPress(KeyEvent.VK_T);
       robot.keyRelease(KeyEvent.VK_T);
       
       robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
		
		
		robot.keyPress(KeyEvent.VK_K);
		robot.keyRelease(KeyEvent.VK_K);
		

        robot.keyPress(KeyEvent.VK_E);
       robot.keyRelease(KeyEvent.VK_E);
       
       robot.keyPress(KeyEvent.VK_N);
       robot.keyRelease(KeyEvent.VK_N);
       
			
		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
