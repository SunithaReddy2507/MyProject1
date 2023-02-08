package PracticePage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ppswitchwindowtabexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","C://Users//USER//Documents//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("openwindow")).click();
		driver.findElement(By.linkText("Open Tab")).click();
		driver.close();

	}

}
