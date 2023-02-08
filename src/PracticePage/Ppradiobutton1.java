package PracticePage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ppradiobutton1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C://Users//USER//Documents//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//input[@value='radio1']")).click();
		driver.findElement(By.xpath("//input[@value='radio2']")).click();
		driver.findElement(By.xpath("//input[@value='radio3']")).click();
		driver.close();
		
		
			}

}
