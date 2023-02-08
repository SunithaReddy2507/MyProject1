package PracticePage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ppiframeexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Users//USER//Documents//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		driver.switchTo().frame(driver.findElement(By.id("courses-iframe")));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
		
	    WebElement iframe =driver.findElement(By.id("courses-iframe"));
		//driver.switchTo().frame(iframe);
		//js.executeScript("document.getElementById('courses-iframe').scrollTop=5000");
		//Actions a=new Actions(driver);
		//WebElement move	=driver.findElement(By.cssSelector(".dropdown-toggle"))	;
		//a.moveToElement(move).keyDown(Keys.TAB).build().perform();
	    js.executeScript("document.getElementById('courses-iframe').onload=function(){this.contentWindow.scrollTo(0, 500)}");


	}

}
