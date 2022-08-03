package uistore;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Testcases {
	
    public static WebElement close(WebDriver driver){
    	WebElement close = driver.findElement(By.xpath("//a[@class='lilo3746-close-link lilo3746-close-icon']"));
        return close;		 
    } 
	
    public static WebElement shop(WebDriver driver) throws InterruptedException{
    	WebElement shop = driver.findElement(By.xpath("//a[normalize-space()='Shop Products']"));
        Actions actions  = new Actions(driver);
        actions.moveToElement(shop).build().perform();
        Thread.sleep(2000);
    	return shop;		 
    } 
    
    public static WebElement liquid(WebDriver driver) throws InterruptedException{
    	WebElement liq = driver.findElement(By.xpath("//div[@class='hero-card theme-cta-secondary active']//div[@class='row']"));
        Actions actions  = new Actions(driver);
        actions.moveToElement(liq).click().build().perform();
        Thread.sleep(2000);
    	return liq;		 
    } 
    
    public static WebElement whites(WebDriver driver){
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	WebElement white = driver.findElement(By.xpath("//strong[normalize-space()='Simply Plus Bleach Alternative']"));
    	js.executeScript("arguments[0].scrollIntoView();", white);
        return white;		 
    } 
    
    public static String text(WebDriver driver){
    	String text = driver.findElement(By.xpath("//h1[contains(text(),'Tide')]")).getText();
    	String ExpectedTitle = "Tide Simply Plus Bleach Alternative Liquid Laundry Detergent";
    	Assert.assertEquals(ExpectedTitle, text);
    	System.out.println("verified the text for whiteness");
    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        return text;		 
    } 

}
