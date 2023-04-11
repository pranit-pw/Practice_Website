package Apple;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Mac {
	
	public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver", "E:\\Pranit\\Velocity Class\\chromedriver_win32\\chromedriver.exe") ;
		
		WebDriver driver = new ChromeDriver() ;
		
		driver.manage().window().maximize();
		
		driver.get("https://www.apple.com/");
		
		WebElement Continue = driver.findElement(By.xpath("//a[text() = 'Continue']")) ;
		
		Continue.click() ;
		Thread.sleep(2000) ;
		
		//To move mouse pointer on Mac Section
		WebElement Mac = driver.findElement(By.xpath("//div[@style='--r-globalnav-flyout-item-number:1;']")) ;
		
		Actions act = new Actions(driver) ;
		
		act.moveToElement(Mac).perform() ;
		Thread.sleep(2000) ;
		
		//To Click on Macbook Air option
		WebElement MacbookAir = driver.findElement(By.xpath("//a[text () = 'MacBook Air']")) ;
		
		MacbookAir.click() ;
		Thread.sleep(3000) ;
		 
		//To click on Compare option
		WebElement Compare = driver.findElement(By.xpath("//span[text() = 'Compare']")) ;
		
		Compare.click() ;
		Thread.sleep(2000) ;
		
		JavascriptExecutor js = (JavascriptExecutor)driver ;
		
		//To scroll The window
		js.executeScript("window.scrollBy(0,400)") ;
		Thread.sleep(2000) ;
		
		// To select the Drop Down 
		WebElement Tab1 = driver.findElement(By.xpath("//select[@id='selector-0']")) ;
		
		Select s = new Select (Tab1) ;
		
		// For Selectimg the option From Drop down menu
		s.selectByValue("bSppbZs9") ;
		Thread.sleep(2000) ;
		
		WebElement Tab2 = driver.findElement(By.xpath("//select[@id='selector-1']")) ;
		
		Select s1 = new Select(Tab2) ;
		
		s1.selectByValue("ll73kl60") ;
		Thread.sleep(2000) ;
		
		WebElement Tab3 = driver.findElement(By.xpath("//select[@id='selector-2']")) ;
		
		Select s2 = new Select(Tab3) ;
		
		s2.selectByValue("KvZD5xrD") ;
		Thread.sleep(4000) ;
		
		//To Scroll till the QuickView Word 
		WebElement QuickView = driver.findElement(By.xpath("//span[text() = 'Quick Look']")) ;
		
		js.executeScript("arguments[0].scrollIntoView(true);", QuickView ) ;
		Thread.sleep(5000) ;
		
		js.executeScript("window.scrollBy(0,-70)") ;
		
		//To Scroll till the 7Core Word 
		WebElement Core = driver.findElement(By.xpath("//span[text()= '7-core']")) ;
		
		js.executeScript("arguments[0].scrollIntoView(true);", Core ) ;
		
		js.executeScript("window.scrollBy(0,-50)") ;
		
	}

}
