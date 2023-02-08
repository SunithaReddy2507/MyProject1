package PracticePage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ppmousehover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Users//USER//Documents//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		Actions a = new Actions(driver);
		//WebElement Mousehover = driver.findElement(By.id("mousehover"));
		// WebElement Top=driver.findElement(By.linkText("Top"));
		// WebElement Reload=driver.findElement(By.linkText("Reload"));
		WebElement mousehover = driver.findElement(By.id("mousehover"));
		a.moveToElement(mousehover).keyDown(Keys.TAB).build().perform();
		System.out.println("page scroll to top");
		a.moveToElement(mousehover).keyDown(Keys.TAB).build().perform();
		System.out.println("page reloaded");
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		

	}

}
